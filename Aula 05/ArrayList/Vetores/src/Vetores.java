public class Vetores {
    public static void main(String[] args) {
        double[] listarNumeros = new double[5];

        listarNumeros[0] = 1;
        listarNumeros[1] = 2;
        listarNumeros[2] = 3;
        listarNumeros[3] = 4;
        listarNumeros[4] = 5;

        for (int i = 0; i < listarNumeros.length; i++) {
            System.out.println(listarNumeros[i]);
        }

        for (double num : listarNumeros) {
            System.out.println(num);
        }
    }
}


