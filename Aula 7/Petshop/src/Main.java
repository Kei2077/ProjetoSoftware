import entidades.Cachorro;
import entidades.Gato;
import entidades.Peixe;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("max",1, 8, "pug");
        Gato gato = new Gato("gato", 2, 12, "laranja");
        Peixe peixe = new Peixe("peixe", 3, 3, "maria");

        System.out.println(gato);
        System.out.println(cachorro);
        System.out.println(peixe);
    }
}
