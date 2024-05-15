package org.exercise;
import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) {
        // Inizializzo array di invitati
        String [] guestsList = {"Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino"};

        // Leggo in input il nome dell'utente
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome per esteso: ");
        String userNameGuest = scanner.nextLine().trim();
        scanner.close();

        // Verifico se l'utente fa parte della lista di invitati
        boolean isInvited = false;
        for (String guest : guestsList) {
            if (userNameGuest.equalsIgnoreCase(guest)) {
                isInvited = true;
                break;
            }
        }

        // Stampo il messaggio adatto
        if (isInvited) {
            System.out.println("Benvenut* alla festa, " + userNameGuest + "!");
        } else {
            System.out.println("Spiacenti, non sei sulla lista degli invitati.");
        }
    }
}
