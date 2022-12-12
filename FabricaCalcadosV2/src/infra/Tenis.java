package infra;

import factorymethod.Calcado;
import factorymethod.IMateriaisFabrica;

public class Tenis extends Calcado {

     public Tenis(IMateriaisFabrica materiais) {
        super(materiais);
        this.setNome("Tenis");
        this.custo = 10;
    }
    
}
