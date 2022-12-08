package infra;

import interfaces.ITecido;

public class TecidoNatural extends Material implements ITecido {

    public TecidoNatural(Componente componente) {
        super(componente);
        this.nome = "Tecido Natural";
        this.custo = 4.5;
    }
    
    @Override
    public String getTecido() {
        return "Tecido de origem natural";
    }
    
}
