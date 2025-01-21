public abstract class Pessoa {    
  protected String nome;
  protected String endereco;
  protected String telefone;

  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }

  public String getEndereco(){
    return endereco;
  }
  public void setEndereco(String endereco){
    this.endereco = endereco;
  }

  public String getTelefone(){
    return telefone;
  }
  public void setTelefone(String telefone){
    this.telefone = telefone;
  }

  public Pessoa(String nome, String endereco, String telefone){
    this.nome = nome;
    this.endereco = endereco;
    this.telefone = telefone;
  }

  public boolean equals(Object obj){
    if(obj instanceof Pessoa){
      Pessoa p = (Pessoa) obj;
      if(getNome().equals (p.getNome()))
        return true;}
    return false;}
}
