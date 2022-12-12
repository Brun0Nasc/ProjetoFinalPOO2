/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

import infra.Sapato;
import infra.Tenis;
import interfaces_materiais.IFabricas;

/**
 *
 * @author Bruno
 */
public class FabricaJuazeiro implements IFabricas {

    private IMateriaisFabrica materiais = new MateriaisJuazeiro();
    
    @Override
    public Calcado criarCalcado(Class c) {
        if(c == Sapato.class){
            return new Sapato(materiais);
        } else if (c == Tenis.class){
            return new Tenis(materiais);
        }
        return null;
    }
    
}
