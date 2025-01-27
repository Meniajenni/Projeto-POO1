import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Confeitaria confeitaria = new Confeitaria();

        confeitaria.setProdutos(new ArrayList<Produto>());
        confeitaria.setClientes(new ArrayList<Cliente>());
        confeitaria.setFuncionarios(new ArrayList<Funcionario>());

        Produto produto1 = new Produto("Pão de Queijo", 3.50, "Salgados"){};
        Produto produto2 = new Produto("Croissant", 4.00, "Salgados"){};

        confeitaria.addProduto(produto1);
        confeitaria.addProduto(produto2);

        Cliente cliente1 = new Cliente("João", "Rua A, 123", "1111-2222");
        Cliente cliente2 = new Cliente("Ana", "Rua B, 456", "3333-4444");

        confeitaria.addCliente(cliente1);
        confeitaria.addCliente(cliente2);

        Funcionario funcionario1 = new Funcionario("Maria", "Rua dos Bobos", "25525525", "Atendente", 1000.00, "Manhã"){};

        confeitaria.addFuncionario(funcionario1);

        System.out.println("Produtos:");
        for (Produto p : confeitaria.getProdutos()) {
            System.out.println("Nome: " + p.getNome() + ", Preço: " + p.getPreco() + ", Categoria: " + p.getCategoria());
        }

        System.out.println("\nClientes:");
        for (Cliente c : confeitaria.getClientes()) {
            System.out.println("Nome: " + c.getNome() + ", Endereço: " + c.getEndereco() + ", Telefone: " + c.getTelefone());
        }

        System.out.println("\nFuncionários:");
        for (Funcionario f : confeitaria.getFuncionarios()) {
            System.out.println("Nome: " + f.getNome() + ", Cargo: " + f.getCargo() + ", Salário: " + f.getSalario() + ", Turno: " + f.getTurno());
        }

        confeitaria.removeProduto(produto1);
        confeitaria.removeCliente(cliente1);
        confeitaria.removeFuncionario(funcionario1);

        System.out.println("\nApós remoção:");

        System.out.println("Produtos:");
        for (Produto p : confeitaria.getProdutos()) {
            System.out.println("Nome: " + p.getNome() + ", Preço: " + p.getPreco() + ", Categoria: " + p.getCategoria());
        }

        System.out.println("\nClientes:");
        for (Cliente c : confeitaria.getClientes()) {
            System.out.println("Nome: " + c.getNome() + ", Endereço: " + c.getEndereco() + ", Telefone: " + c.getTelefone());
        }

        System.out.println("\nFuncionários:");
        if (confeitaria.getFuncionarios().isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario f : confeitaria.getFuncionarios()) {
                System.out.println("Nome: " + f.getNome() + ", Cargo: " + f.getCargo() + ", Salário: " + f.getSalario() + ", Turno: " + f.getTurno());
            }
        }
    }
}
