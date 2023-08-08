public class Main {
    public static void main(String[] args) {

       /* for (int x = 1; x <= 10; x = x + 2) {
            System.out.println("Executou: " + x);
        }*/

        String[] familia = new String[4];
        familia[0] = "Jhonathan";
        familia[1] = "Vera";
        familia[2] = "Ivanildo";
        familia[3] = "Janny";

        for (String nome : familia){
            System.out.println(nome);
        }

       int[] numeros = {1, 2, 3, 4, 5};
        for (int n : numeros){
            System.out.println("executou: " + n);
        }
    }
}