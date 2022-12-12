/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

import infra.BorrachaSintetica;
import infra.Componente;
import infra.CouroSintetico;
import infra.Palmilha;
import infra.TecidoSintetico;
import interfaces_materiais.IBorracha;
import interfaces_materiais.ICouro;
import interfaces_materiais.IPalmilha;
import interfaces_materiais.ITecido;

/**
 *
 * @author Bruno
 */
public class MateriaisJuazeiro implements IMateriaisFabrica {
    private Componente componente;

    public Componente getComponente() {
        return componente;
    }

    public void setComponente(Componente componente) {
        this.componente = componente;
    }
    
    @Override
    public ICouro setCouro(Componente c) {
        componente = new CouroSintetico(c);
        return new CouroSintetico(c);
    }

    @Override
    public IBorracha setBorracha(Componente c) {
        componente = new BorrachaSintetica(c);
        return new BorrachaSintetica(c);
    }

    @Override
    public ITecido setTecido(Componente c) {
        componente = new TecidoSintetico(c);
        return new TecidoSintetico(c);
    }

    @Override
    public IPalmilha setPalmilha(Componente c) {
        componente = new Palmilha(c);
        return new Palmilha(c);
    }
    
}
