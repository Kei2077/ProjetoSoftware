public class Main {
    public static void main(String[] args) {
        Lanche xEgg = new Lanche();


        xEgg.nome = "X-Egg";
        xEgg.preco = 500;
        xEgg.descricao = "pao, ovo";
        System.out.println(xEgg.nome + xEgg.preco + xEgg.descricao + "\nsem correcao"); // sem correcao
        System.out.println("Lanche: " + xEgg.nome
            + "\nPreco R$: " + xEgg.preco
            + "\nDescricao: " + xEgg.descricao
        );
        System.out.println("===========");
        Lanche xTudo = new Lanche();

        xTudo.nome = "X-Tudo";
        xTudo.preco = 499;
        xTudo.descricao = "pao, tudo";
        System.out.println(xTudo.nome + xTudo.preco + xTudo.descricao);
        System.out.println("Lanche: " + xTudo.nome
            + "\nPreco R$: " + xTudo.preco
            + "\nDescricao: " + xTudo.descricao
        );
        System.out.println("============");
        xEgg.exibir();
        xTudo.exibir();

        System.out.println("============");
        carro tr4 = new carro();
        tr4.cor = "preta";
        tr4.ano = 2016;
        tr4.marca = "jooj";
        tr4.modelo = "suv";
        tr4.exibirInformacoes();
        System.out.println("============");
        carro sw = new carro();
        sw.cor = "branca";
        sw.ano = 2018;
        sw.marca = "jaaj";
        sw.modelo = "suv";
        sw.exibirInformacoes();
    }
}

