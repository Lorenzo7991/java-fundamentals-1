package org.exercise;
import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) {
        // Inizializzo array di invitati
        String [] guests_list = {"Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino"};

        // Leggo in input il nome dell'utente
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome per esteso: ");
        String user_name_guest = scanner.nextLine().trim();
        scanner.close();

        // Verifico se l'utente fa parte della lista di invitati
        boolean isInvited = false;
        for (String guest : guests_list) {
            if (user_name_guest.equalsIgnoreCase(guest)) {
                isInvited = true;
                break;
            }
        }

        // Stampo il messaggio adatto
        if (isInvited) {
            System.out.println("Benvenut* alla festa, " + user_name_guest + "!");
        } else {
            System.out.println("Spiacenti, non sei sulla lista degli invitati.");
        }
    }
}
