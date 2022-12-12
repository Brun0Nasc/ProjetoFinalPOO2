/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabricacalcadosv2;

import factorymethod.Calcado;
import factorymethod.FabricaCrato;
import factorymethod.FabricaJuazeiro;
import factorymethod.MateriaisCrato;
import factorymethod.MateriaisJuazeiro;
import infra.Componente;
import infra.DecoradorMateriais;
import infra.Sapato;
import infra.Tenis;
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
       IFabricas fJuazeiro = new FabricaJuazeiro();
       
       // Fabricando um sapato na fábrica do Crato
       c = fCrato.criarCalcado(Sapato.class);
       
       materiais.setNome(c.getNome());
       materiais.setCusto(c.getCusto());
       
       System.out.println("Fabricando sapato na fábrica do Crato");
       c.fabricar(materiais);
       
       MateriaisCrato mc = new MateriaisCrato();
       mc.setComponente(materiais);
       mc.setBorracha(mc.getComponente());
       mc.setCouro(mc.getComponente());
       mc.setTecido(mc.getComponente());
       mc.setPalmilha(mc.getComponente());
       
       materiais = mc.getComponente();
       
       System.out.println("__________________________________");
       System.out.println(materiais.getNome());
       System.out.println(materiais.getCusto());
       
       // Fabricando um sapato na fábrica do Juazeiro
       c = fJuazeiro.criarCalcado(Sapato.class);
       materiais = new DecoradorMateriais();
       
       materiais.setNome(c.getNome());
       materiais.setCusto(c.getCusto());
       
       System.out.println("__________________________________"
               + "\nFabricando sapato na fábrica do Juazeiro");
       c.fabricar(materiais);
       
       MateriaisJuazeiro mj = new MateriaisJuazeiro();
       mj.setComponente(materiais);
       mj.setBorracha(mj.getComponente());
       mj.setCouro(mj.getComponente());
       mj.setTecido(mj.getComponente());
       mj.setPalmilha(mj.getComponente());
       
       materiais = mj.getComponente();
       
       System.out.println("__________________________________");
       System.out.println(materiais.getNome());
       System.out.println(materiais.getCusto());
       
       // Fabricando um tênis na fábrica do Crato
       c = fCrato.criarCalcado(Tenis.class);
       materiais = new DecoradorMateriais();
       
       materiais.setNome(c.getNome());
       materiais.setCusto(c.getCusto());
       
       System.out.println("__________________________________"
               + "\nFabricando tênis na fábrica do Crato");
       c.fabricar(materiais);
       
       mc = new MateriaisCrato();
       mc.setComponente(materiais);
       mc.setBorracha(mc.getComponente());
       mc.setCouro(mc.getComponente());
       mc.setTecido(mc.getComponente());
       mc.setPalmilha(mc.getComponente());
       
       materiais = mc.getComponente();
       
       System.out.println("__________________________________");
       System.out.println(materiais.getNome());
       System.out.println(materiais.getCusto());
       
       // Fabricando um tênis na fábrica do Juazeiro
       c = fJuazeiro.criarCalcado(Sapato.class);
       materiais = new DecoradorMateriais();
       
       materiais.setNome(c.getNome());
       materiais.setCusto(c.getCusto());
       
       System.out.println("__________________________________"
               + "\nFabricando tenis na fábrica do Juazeiro");
       c.fabricar(materiais);
       
       mj = new MateriaisJuazeiro();
       mj.setComponente(materiais);
       mj.setBorracha(mj.getComponente());
       mj.setCouro(mj.getComponente());
       mj.setTecido(mj.getComponente());
       mj.setPalmilha(mj.getComponente());
       
       materiais = mj.getComponente();
       
       System.out.println("__________________________________");
       System.out.println(materiais.getNome());
       System.out.println(materiais.getCusto());
    }
    
}
