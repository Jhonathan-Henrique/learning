public class Main {
    public static void main(String[] args) {

        int idadeJohn = 27;

        switch (idadeJohn) {
            case 18:
                System.out.println("Voce alcançou a maior idade");

            break;
            case 25:
                System.out.println("Parabens, voce e jovem!");

            break;
            case 27:
                System.out.println("Essa e a minha idade atual");

            break;

            default:
                System.out.println("Voce nao acertou nenhuma idade");

        }
    }
}