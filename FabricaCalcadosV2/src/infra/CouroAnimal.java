package infra;

import interfaces_materiais.ICouro;

public class CouroAnimal extends Material implements ICouro {

    public CouroAnimal(Componente componente) {
        super(componente);
        this.nome = "Couro animal";
        this.custo = 7.5;
    }
    
    @Override
    public String getCouro() {
        return this.nome + ": de alta qualidade";
    }
    
}
