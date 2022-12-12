package factorymethod;

import infra.Componente;

public abstract class Calcado {
    private String cor;
    private double tamanho;
    private IMateriaisFabrica materiais;
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

    public Calcado(IMateriaisFabrica materiais) {
        this.materiais = materiais;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    public void fabricar(Componente c){
        montar(c);
        encaixotar();
    }   
    
    public void montar(Componente c){
        
        System.out.println("Montando " + this.getNome());
        System.out.println("Materiais:");
        
        System.out.println(materiais.setBorracha(c).getBorracha());
        System.out.println(materiais.setCouro(c).getCouro());
        System.out.println(materiais.setTecido(c).getTecido());
        System.out.println(materiais.setPalmilha(c).getPalmilha());
    }
    
    public void encaixotar(){
        System.out.println("Encaixotando " + this.getNome());
    }
    
}
