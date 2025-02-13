import java.util.Scanner;

public class Esercizio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int televisori = 0, frigoriferi = 0, lavatrici = 0, altro = 0;
       
        double ricavotelevisori = 0, ricavofrigoriferi = 0, ricavolavatrici = 0, ricavoaltro = 0;

        int totale = 0;
        double totaleDue = 0;

        System.out.print("Inserisci il numero di prodotti venduti: ");
        int n = scanner.nextInt();

for (int i = 0; i < n; i++) {
        System.out.println("\nInserisci i dettagli del prodotto " + (i + 1));
        System.out.print("Tipo (1 = Televisore, 2 = Frigorifero, 3 = Lavatrice, 4 = Altro): ");
        int tipo = scanner.nextInt();
        System.out.print("Prezzo del prodotto: ");
        double prezzo = scanner.nextDouble();

    if (tipo == 1) {
                televisori++;
                ricavotelevisori += prezzo;
            } 
        else if (tipo == 2) {
                frigoriferi++;
               ricavofrigoriferi += prezzo;
            } 
        else if (tipo == 3) {
                lavatrici++;
                ricavolavatrici += prezzo;
            } 
        else {
                altro++;
                ricavoaltro += prezzo;
            }
            totale++;
            totale += prezzo;
        }

    scanner.close();
    System.out.println("\nVENDITE FINALI");
    System.out.println("Ricavo totale: €" + totaleDue);
    System.out.println("Numero totale di prodotti venduti: " + totale);

    System.out.println("\nCategoria: televisori");
    System.out.println("Prodotti venduti: " + televisori + " (" + ((totale > 0) ? ((double) televisori / totale) * 100 : 0) + "%)");
    System.out.println("Ricavo: €" + ricavotelevisori + " (" + ((totale > 0) ? (ricavotelevisori / totale) * 100 : 0) + "%)");

    System.out.println("\nCategoria: frigoriferi");
    System.out.println("Prodotti venduti: " + frigoriferi + " (" + ((totale > 0) ? ((double) frigoriferi / totale) * 100 : 0) + "%)");
    System.out.println("Ricavo: €" + ricavofrigoriferi + " (" + ((totale > 0) ? (ricavofrigoriferi / totale) * 100 : 0) + "%)");

    System.out.println("\nCategoria: lavatrici");
    System.out.println("Prodotti venduti: " + lavatrici + " (" + ((totale > 0) ? ((double) lavatrici / totale) * 100 : 0) + "%)");
    System.out.println("Ricavo: €" + ricavolavatrici + " (" + ((totale > 0) ? (ricavolavatrici / totale) * 100 : 0) + "%)");

    System.out.println("\nCategoria: altro");
    System.out.println("Prodotti venduti: " + altro + " (" + ((totale > 0) ? ((double) altro / totale) * 100 : 0) + "%)");
    System.out.println("Ricavo: €" + ricavoaltro + " (" + ((totale > 0) ? (altro / totale) * 100 : 0) + "%)");
    }
}
