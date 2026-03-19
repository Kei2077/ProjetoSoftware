package entidades;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(double nota2, double nota1, String nome) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(double nota1) {
        this.quantidade = quantidade;
    }

    public void setPreco(double nota2) {
        this.preco = preco;
    }

    public double mediaAluno(){
        return (this.nota1 + this.nota2) / 2;
    }

    public String statusAluno(){
        if (mediaAluno() >= 7){
            return "Aprovado";
        } else if (mediaAluno() >= 5){
            return "Exame";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public String toString() {
        return " / "
                + this.nome + " / "
                + this.nota1 + " / "
                + this.nota2 + " / "
                + mediaAluno() + " / "
                + this.statusAluno();
    }
}
