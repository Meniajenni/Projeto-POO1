public class Bolo extends Produto{
  private String sabor;
  private double peso;
  private String receita;

  public String getSabor(){
    return sabor;
  }
  public void setSabor(String sabor){
    this.sabor = sabor;
  }

  public double getPeso(){
    return peso;
  }
  public void setPeso(double peso){
    this.peso = peso;
  }

  public String getReceita(){
    return receita;
  }
  public void setReceita(String receita){
    this.receita = receita;
  }

  public Bolo(String nome, double preco, String categoria, String sabor, double peso, String receita){
    super(nome, preco, categoria);
    this.sabor = sabor;
    this.peso = peso;
    this.receita = receita;
  }

  public boolean equals(Object obj){
    if(obj instanceof Bolo){
      Bolo b = (Bolo) obj;
      if(getSabor().equals(b.getSabor()))
        return true;
    }
    return false;
  }
}
