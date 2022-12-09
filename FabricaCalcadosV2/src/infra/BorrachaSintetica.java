package infra;

import interfaces_materiais.IBorracha;

public class BorrachaSintetica extends Material implements IBorracha {

    public BorrachaSintetica(Componente componente) {
        super(componente);
        this.nome = "Borracha sintética";
        this.custo = 4.5;
    }
    
    @Override
    public String getBorracha() {
        return this.nome + ": polímeros diênicos sintetizados";
    }
    
}
