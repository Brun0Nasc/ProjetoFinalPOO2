/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

import infra.BorrachaNatural;
import infra.Componente;
import infra.CouroAnimal;
import infra.Palmilha;
import infra.TecidoNatural;
import interfaces_materiais.IBorracha;
import interfaces_materiais.ICouro;
import interfaces_materiais.IPalmilha;
import interfaces_materiais.ITecido;

/**
 *
 * @author brisa
 */
public class MateriaisCrato implements IMateriaisFabrica {
    private Componente componente;

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }
    
    @Override
    public ICouro setCouro(Componente c) {
        componente = new CouroAnimal(c);
        return new CouroAnimal(c);
    }

    @Override
    public IBorracha setBorracha(Componente c) {
        componente = new BorrachaNatural(c);
        return new BorrachaNatural(c);
    }

    @Override
    public ITecido setTecido(Componente c) {
        componente = new TecidoNatural(c);
        return new TecidoNatural(c);
    }

    @Override
    public IPalmilha setPalmilha(Componente c) {
        componente = new Palmilha(c);
        return new Palmilha(c);
    }
    
}
