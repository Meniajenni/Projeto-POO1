public class Bolodopote extends Produto {
  private String sabor;
  private double tamanho;

  public Bolodopote(String nome, double preco, String categoria, String sabor, double tamanho) {
    super(nome, preco, categoria); 
    this.sabor = sabor;
    this.tamanho = tamanho;
  }

  public String getSabor() {
    return sabor;
  }

  public void setSabor(String sabor) {
    this.sabor = sabor;
  }

  public double getTamanho() {
    return tamanho;
  }

  public void setTamanho(double tamanho) {
    this.tamanho = tamanho;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Bolodopote) {
      Bolodopote b = (Bolodopote) obj;
      return getSabor().equals(b.getSabor()) && getNome().equals(b.getNome());
    }
    return false;
  }
}
