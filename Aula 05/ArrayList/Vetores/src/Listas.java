import java.util.ArrayList;


public class Listas {
    public static void main(String[] args) {
        ArrayList<Integer> listaNotas = new ArrayList<>();

        listaNotas.add(10);
        listaNotas.add(9);
        listaNotas.add(8);
        listaNotas.add(7);
        listaNotas.add(6);
        listaNotas.add(5);
        listaNotas.add(4);
        listaNotas.add(3);
        listaNotas.add(2);
        listaNotas.add(1);
        listaNotas.add(0);
        System.out.println(listaNotas);

        listaNotas.add(2, 3);
        listaNotas.add(4, 5);
        System.out.println(listaNotas);

        System.out.println("O tamnaho da lista: " + listaNotas.size());

        System.out.println("A segunda posicao da lista: " + listaNotas.get(1));

        listaNotas.set(0, 20);
        System.out.println(listaNotas);

        listaNotas.remove(10);
        listaNotas.remove(listaNotas.indexOf(20));

        listaNotas.removeIf(element -> element < 7);
        System.out.println(listaNotas);

        for(Integer nota: listaNotas){
            System.out.println(nota);
        }
    }
}