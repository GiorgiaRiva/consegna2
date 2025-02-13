import java.util.Scanner;
public class Esercizio_2 {
    public static void main(String[] args) {
        int secondi = secondi();
        tempoc(secondi);
    }

    public static int secondi() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Inserisci un numero da 0 a 86400: ");
    int secondi = scanner.nextInt();
    while (secondi < 0 || secondi > 86400) { 
            System.out.println("non è compreso tra i due valori indicati");
            System.out.print("Inserisci un'altro numero: ");
            secondi = scanner.nextInt();
        }

        scanner.close();
    return secondi;
    }


    public static void tempoc(int secondi) {
        int ore = secondi / 3600; 
        int minuti = (secondi % 3600) / 60;
        int sec = secondi % 60;        

        System.out.println(secondi + " secondi corrispondono a: " + ore + "h, " + minuti + "m, " + sec + "s.");
    }
}

