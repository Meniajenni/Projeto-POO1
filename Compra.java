import java.util.ArrayList;
public class Compra {
    private double valorTotal;
    private ArrayList<Produto> produtos;

    public double getValorTotal(){
        return valorTotal;
    }
    public void setValorTotal(double v) {
        this.valorTotal = v;
    }

      public ArrayList<Produto> getProdutos(){
        return produtos;
      }
      public void setProdutos(ArrayList<Produto> p){
        this.produtos = p;
      }

      public void addProdutos(Produto p){
        this.produtos.add(p);
      }
      public void removeProdutos(Produto p){
          this.produtos.remove(p);
        }
    public Compra(double total, ArrayList<Produto> produtos) {
        this.valorTotal = total;
        this.produtos = produtos;
    }

    public boolean equals(Object obj){
        if(obj instanceof Compra){
            Compra c = (Compra) obj;
            if(getValorTotal() == c.getValorTotal())
                return true;
        }
        return false;
    }
}
