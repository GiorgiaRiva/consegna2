import java.util.Scanner;
public class Esercizio_1
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numeri = new int[4];
        for (int i = 0; i < 4; i++) {
                System.out.println("Inserisci quattro numeri: ");
                numeri[i]= scanner.nextInt();
                }

                scanner.close();
	}
}