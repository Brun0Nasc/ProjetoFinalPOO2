package infra;

import interfaces_materiais.IPalmilha;

public class Palmilha extends Material implements IPalmilha {

    public Palmilha(Componente componente) {
        super(componente);
        this.nome = "Palmilha";
        this.custo = 3;
    }
    
    @Override
    public String getPalmilha() {
        return this.nome + ": material padrão.";
    }
    
}
