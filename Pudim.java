public class Pudim extends Produto {
  private double tamanho;
  private String sabor;

  public Pudim(String nome, double preco, String categoria, String sabor, double tamanho) {
    super(nome, preco, categoria);
    this.sabor = sabor;
    this.tamanho = tamanho;
  }

  public double getTamanho() {
    return tamanho;
  }

  public void setTamanho(double tamanho) {
    this.tamanho = tamanho;
  }

  public String getSabor() {
    return sabor;
  }

  public void setSabor(String sabor) {
    this.sabor = sabor;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Pudim) {
      Pudim p = (Pudim) obj;
      return getSabor().equals(p.getSabor()) && getNome().equals(p.getNome());
    }
    return false;
  }
}
