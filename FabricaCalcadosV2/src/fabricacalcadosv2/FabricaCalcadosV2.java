/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fabricacalcadosv2;

import infra.BorrachaNatural;
import infra.Componente;
import infra.Sapato;
import infra.TecidoNatural;

/**
 *
 * @author Bruno
 */
public class FabricaCalcadosV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Componente c = new Sapato();
        c = new TecidoNatural(c);
        c = new BorrachaNatural(c);
        
        System.out.println(c.getNome());
        System.out.println("Custo: " + c.getCusto());
    }
    
}
