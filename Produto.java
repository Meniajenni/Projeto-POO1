public abstract class Produto{
  String nome;
  double preco;
  String categoria;

  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }

  public double getPreco(){
    return preco;
  }
  public void setPreco(double preco){
    this.preco = preco;
  }

  public String getCategoria(){
    return categoria;
  }
  public void setCategoria(String categoria){
    this.categoria = categoria;
  }

  public Produto(String nome, double preco, String categoria){
    this.nome = nome;
    this.preco = preco;
    this.categoria = categoria;
  }

  public boolean equals(Object obj){
    if(obj instanceof Produto){
      Produto p = (Produto) obj;
      if(getNome().equals(p.getNome()))
        return true;
    }
    return false;
  }
}
