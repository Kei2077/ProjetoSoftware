import java.util.ArrayList;

public class ListaNomes {
    static void main() {
        ArrayList<String> ListaNomes = new ArrayList<>();
        ListaNomes.add("pedro");
        ListaNomes.add("maria");
        ListaNomes.add("jose");
        ListaNomes.add("maria");

        ListaNomes.removeIf(nome -> nome.equals("Maria"));
        ListaNomes.removeIf(nome -> nome.contains("jß"));
        for (String nome : ListaNomes) {
            System.out.println(nome);
        }



    }
}
