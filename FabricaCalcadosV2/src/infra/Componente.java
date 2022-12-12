package infra;

import factorymethod.Calcado;

public abstract class Componente {
    protected String nome;
    protected double custo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    
}
