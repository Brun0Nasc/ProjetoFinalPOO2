/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabricacalcadosv2;

import factorymethod.Calcado;
import factorymethod.FabricaCrato;
import factorymethod.MateriaisCrato;
import infra.Componente;
import infra.DecoradorMateriais;
import infra.Sapato;
import interfaces_materiais.IFabricas;

/**
 *
 * @author Bruno
 */
public class FabricaCalcadosV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Calcado c;
       Componente materiais = new DecoradorMateriais();
       IFabricas fCrato = new FabricaCrato();
       
       c = fCrato.criarCalcado(Sapato.class);
       
       materiais.setNome(c.getNome());
       materiais.setCusto(c.getCusto());
       
       c.fabricar(materiais);
       
       MateriaisCrato m = new MateriaisCrato();
       m.setComponente(materiais);
       m.setBorracha(m.getComponente());
       m.setCouro(m.getComponente());
       m.setTecido(m.getComponente());
       m.setPalmilha(m.getComponente());
       
       materiais = m.getComponente();
       
       System.out.println(materiais.getNome());
       System.out.println(materiais.getCusto());
       
    }
    
}
