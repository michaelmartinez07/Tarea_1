import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int j1 = 0, j2 = 0;

        System.out.println("Jugador 1: ");
        for (int i=1; i<=2; i++){
            Random random = new Random();
            int dado1 = random.nextInt(1, 7);
            System.out.println(dado1);
            j1 += dado1;
        }
        System.out.println("Total: "+j1);
        System.out.println("---------------------------------------------------");

        System.out.println("Jugador 2: ");
        for (int i=1; i<=2; i++){
            Random random = new Random();
            int dado2 = random.nextInt(1, 7);
            System.out.println(dado2);
            j2 += dado2;
        }
        System.out.println("Total: "+j2);

        System.out.println("---------------------------------------------------");

        if (j1==j2){
            System.out.println("Empate");
        }
        else{
            if (j1>j2){
                System.out.println("Ganador: Jugador 1");
            }
            else{
                System.out.println("Gandor: Jugador 2");
            }
        }
    }
}