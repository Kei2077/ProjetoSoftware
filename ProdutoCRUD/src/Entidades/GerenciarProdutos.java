package Entidades;

import java.util.ArrayList;

public class GerenciarProdutos {
    private ArrayList<Produto> produtos;

    public GerenciarProdutos() {
        produtos = new ArrayList<>();
    }

    // Cadastrar um novo produto
    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    // Listar todos os produtos em formato de tabela
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        System.out.println("======================================================================");
        System.out.println("| ID | NOME                | PREÇO     | QUANTIDADE | VALOR EM ESTOQUE |");
        System.out.println("======================================================================");
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            System.out.printf("| %-2d | %-20s | R$ %-8.2f | %-10d | R$ %-10.2f |\n",
                    i, p.getNome(), p.getPreco(), p.getQuantidade(), p.calcularValorEstoque());
        }
        System.out.println("======================================================================");
    }


    public void atualizarProduto(int id, String nome, double preco, int quantidade) {
        if (id >= 0 && id < produtos.size()) {
            Produto p = produtos.get(id);
            p.setNome(nome);
            p.setPreco(preco);
            p.setQuantidade(quantidade);
            System.out.println("Produto atualizado com sucesso!");
        } else {
            System.out.println("ID inválido!");
        }
    }


    public void removerProduto(int id) {
        if (id >= 0 && id < produtos.size()) {
            produtos.remove(id);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("ID inválido!");
        }
    }
}