package infra;

import factorymethod.Calcado;
import factorymethod.IMateriaisFabrica;

public class Sapato extends Calcado {

    public Sapato(IMateriaisFabrica materiais) {
        super(materiais);
        this.setNome("Sapato");
        this.custo = 15;
    }
    
}
