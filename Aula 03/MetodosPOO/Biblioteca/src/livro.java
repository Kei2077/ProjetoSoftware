public class livro {
    String titulo;
    String autor;
    int quantidade;
    double valorLivro;

    //construtor

    public livro(String titulo, String autor, int quantidade, double valorLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
        this.valorLivro = valorLivro;

    }

    //exibir as informacoes do livro

    public void exibirLivro() {
        System.out.println("Titulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nQuantidade: " + this.quantidade +
                "\nValor do livro: R$ " + valortotal()
        );
    }
    public void emprestarLivro(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Informe uma quantidade valida");
        }
    }
    public void Devolvelivro(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("Informe uma quantidade valida");
        }
    }
    public double valortotal() {
        return this.quantidade * this.valorLivro;
    }

}
