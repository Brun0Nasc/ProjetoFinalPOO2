/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infra;

/**
 *
 * @author brisa
 */
public class DecoradorMateriais extends Componente {
   
    public DecoradorMateriais() {
        this.nome = this.getNome();
        this.custo = this.getCusto();
    }
    
}
