import java.util.ArrayList;
public class Cliente extends Pessoa{
  private ArrayList<Compra> historicoDeCompras;

  public ArrayList<Compra> getHistoricoDeCompras(){
    return historicoDeCompras;
  }
  public void setHistoricoDeCompras(ArrayList<Compra> compra){
    this.historicoDeCompras = compra;
  }

  public void addHistoricoDeCompras(Compra compra){
    this.historicoDeCompras.add(compra);
  }
  public void removeHistoricoDeCompras(Compra compra){
    this.historicoDeCompras.remove(compra);
  }

  public Cliente(String nome, String endereco, String telefone){
    super(nome, endereco, telefone);
  }

  public boolean equals(Object obj){
    if(obj instanceof Cliente){
      Cliente c = (Cliente) obj;
      if(getNome().equals(c.getNome()))
        return true;
    }
    return false;
  }
}
