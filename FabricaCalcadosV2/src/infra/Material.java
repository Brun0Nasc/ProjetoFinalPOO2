package infra;

public abstract class Material extends Componente {
    private Componente componente;

    public Material(Componente componente) {
        this.componente = componente;
    }

    public Componente getComponente() {
        return componente;
    }

    @Override
    public double getCusto() {
        return this.custo + this.componente.getCusto();
    }

    @Override
    public String getNome() {
        return this.componente.getNome() + ", " + this.nome;
    }
    
}
