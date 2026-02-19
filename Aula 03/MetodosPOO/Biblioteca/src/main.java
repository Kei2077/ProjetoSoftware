public class main {
    public static void main(String[] args) {
        livro HarryPotter = new livro("Harry potter", "J.K", 500, 60.99);
        livro senhorDosAneis = new livro("senhor dos aneis", "J.R.R.", 500, 120.50);

        HarryPotter.exibirLivro();
        senhorDosAneis.exibirLivro();

        HarryPotter.emprestarLivro(1);
    }
}
