import java.util.Scanner;
public class Esercizio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci quattro numeri:");

        for (int i = 0; i < 4; i++) { 
            int numero = scanner.nextInt();

           
            if (numero == 0) {
                System.out.println("Programma terminato.");
                break; 
            }

            paridispari(numero);
        }

        scanner.close();
    }

   

    public static void paridispari(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " **"); 
        } else if (numero % 3 == 0) {
            System.out.println(numero + " ##"); 
        } else {
            System.out.println(numero + " numero non valido, continua"); 
        }
    }
}

