package infra;

import interfaces_materiais.ITecido;

public class TecidoSintetico extends Material implements ITecido {

    public TecidoSintetico(Componente componente) {
        super(componente);
        this.nome = "Tecido sintetico";
        this.custo = 1.5;
    }
    
    @Override
    public String getTecido() {
        return this.nome + ": base de poliester";
    }
    
}
