package factorymethod;

import infra.Componente;

public abstract class Calcado extends Componente {
    private String cor;
    private double tamanho;
    private IMateriaisFabrica materiais;

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
    
    public void fabricar(){
        
    }
    
    public void montar(){
        System.out.println("Montando " + this.getNome());
        System.out.println("Materiais:");
        System.out.println(materiais.setBorracha().getBorracha());
        System.out.println(materiais.setCouro().getCouro());
        System.out.println(materiais.setTecido().getTecido());
        System.out.println(materiais.setPalmilha().getPalmilha());
    }
    
    public void encaixotar(){
        System.out.println("Encaixotando " + this.getNome());
    }
    
}
