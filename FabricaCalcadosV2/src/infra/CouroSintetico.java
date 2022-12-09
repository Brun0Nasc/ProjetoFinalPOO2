package infra;

import interfaces_materiais.ICouro;

public class CouroSintetico extends Material implements ICouro {

    public CouroSintetico(Componente componente) {
        super(componente);
        this.nome = "Couro sintetico";
        this.custo = 3;
    }
    
    @Override
    public String getCouro() {
        return this.nome + ": de qualidade mediana";
    }
    
}
