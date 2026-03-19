package entidades;
import java.util.ArrayList;

public class GerenciarListaProdutos {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public void adicionarProduto(Produto, produto) {
        listaProdutos.add(produto);
        System.out.println("Produto adicionado com sucesso!");

    }
    public void listarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum Produto encontrado!");

        } else {
            System.out.println("ID  NOME PRECO  QUANTIDADE  VALOR EM ESTOQUE");
            for (int i = 0; i < listaProdutos.size(); i++) {
                System.out.println(listaProdutos.get(i));
            }
        }
    }

    public void atualizarProduto(int idproduto, String nome, double preco, int quantidade){
        Produto produto = listarProdutos.get(idProduto);
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);
        produto.setValorEstoque(valoremEstoque);

        System.out.println("Produto atualizado com sucesso!");
    }

    public void removerProduto(int idproduto){
        listaProdutos.remove(idproduto);
        System.out.println("Produto removido com sucesso!");
    }


}
