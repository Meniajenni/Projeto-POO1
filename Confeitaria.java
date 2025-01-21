import java.util.ArrayList;
public class Confeitaria{
  private ArrayList<Produto> produtos;
  private ArrayList<Cliente> clientes;
  private ArrayList<Funcionario> funcionarios;

  public ArrayList<Produto> getProdutos(){
    return produtos;
  }
  public void setProdutos(ArrayList<Produto> produtos){
    this.produtos = produtos;
  }

  public ArrayList<Cliente> getClientes(){
    return clientes;
  }
  public void setClientes(ArrayList<Cliente> clientes){
    this.clientes = clientes;
  }

  public ArrayList<Funcionario> getFuncionarios(){
    return funcionarios;
  }
  public void setFuncionarios(ArrayList<Funcionario> funcionarios){
    this.funcionarios = funcionarios;
  }

  public void addProduto(Produto produto){
    this.produtos.add(produto);
  }
  public void removeProduto(Produto produto){
    this.produtos.remove(produto);
  }

  public void addCliente(Cliente cliente){
    this.clientes.add(cliente);
  }
  public void removeCliente(Cliente cliente){
    this.clientes.remove(cliente);
  }

  public void addFuncionario(Funcionario funcionario){
    this.funcionarios.add(funcionario);
  }
  public void removeFuncionario(Funcionario funcionario){
    this.funcionarios.remove(funcionario);
  }

  public boolean equals(Object obj){
    if(obj instanceof Confeitaria){
      Confeitaria c = (Confeitaria) obj;
      if(getProdutos().equals(c.getProdutos()))
        return true;
    }
    return false;
  }
}
