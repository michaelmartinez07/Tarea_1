import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre completo:");
        String nombreCompleto = scanner.nextLine();

        String[] palabras = nombreCompleto.split(" ");

        for (String palabra : palabras) {
            int cantidadLetras = palabra.length();
            System.out.println(palabra + ": " + cantidadLetras + " letras");
        }
    }
}