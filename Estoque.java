import java.util.List;

public class Estoque {
    private List<Produto> produtos;
    private int quantidade;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Estoque(List<Produto> produtos, int quantidade) {
        this.produtos = produtos;
        this.quantidade = quantidade;
    }
}
