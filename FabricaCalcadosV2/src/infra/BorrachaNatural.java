package infra;

import interfaces.IBorracha;

public class BorrachaNatural extends Material implements IBorracha {

    public BorrachaNatural(Componente componente) {
        super(componente);
        this.nome = "Borracha Natural";
        this.custo = 8.7;
    }
    
    @Override
    public String getBorracha() {
        return "Borracha de origem natural";
    }
    
}
