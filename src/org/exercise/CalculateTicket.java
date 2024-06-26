package org.exercise;
import java.util.Scanner;

public class CalculateTicket {
    public static void main(String[] args) {
        // Variabile per indicare il prezzo per km
        double pricePerKm = 0.21;

        // Creazione scanner per input utente
        Scanner scanner = new Scanner(System.in);

        // Richiesta numero km all'utente
        System.out.println("Inserisci il numero di chilometri da percorrere: ");
        int km = scanner.nextInt();

        // Richiesta età passeggero
        System.out.println("Inserisci la tua età: ");
        int age = scanner.nextInt();

        // Chiusura scanner
        scanner.close();


        // Calcolo biglietto standard
        double startingPrice = km * pricePerKm;

        // Calcolo ed applicazione sconto
        double finalPrice;
        if (age < 18) {
            finalPrice = startingPrice * 0.80;
            System.out.println("Ti è stato applicato uno sconto del 20% come junior");
        } else if (age > 65) {
            finalPrice = startingPrice * 0.60;
            System.out.println("Ti è stato applicato uno sconto dell' 80% come senior");
        } else {
            // Nessuno sconto applicato se nessuna delle condizioni è verificata
            finalPrice = startingPrice;
        }

        // Output biglietto
        System.out.printf("Il prezzo totale del biglietto è: %.2f €\n", finalPrice);





    }
}
