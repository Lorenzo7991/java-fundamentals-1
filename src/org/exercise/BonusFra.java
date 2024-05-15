package org.exercise;
import java.util.Scanner;

public class BonusFra {
    public static void main(String[] args) {
        // Leggo la stringa e il carattere scelti dall'utente
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la stringa in cui effettuare la ricerca: ");
        String userString = scanner.nextLine();
        System.out.print("Inserisci il carattere da cercare: ");
        char userChar = scanner.next().charAt(0);
        scanner.close();

        // Inizializzo variabili per memorizzare la lunghezza massima della sequenza e l'indice di inizio
        int maxSequenceLength = 0;
        int startCharIndex = -1;
        int currentSequenceLength = 0;
        int currentCharIndex = -1;

        // Itero sulla stringa per trovare la lunghezza della sequenza più lunga del carattere
        for (int i = 0; i < userString.length(); i++) {
            char currentChar = userString.charAt(i);
            if (currentChar == userChar) {
                // Se il carattere corrente corrisponde al carattere scelto
                if (currentSequenceLength == 0) {
                    // Se è il primo carattere della sequenza, memorizza l'indice di inizio
                    currentCharIndex = i;
                }
                // Aumento la lunghezza della sequenza corrente
                currentSequenceLength++;
            } else {
                // Se il carattere corrente non corrisponde al carattere scelto
                if (currentSequenceLength > maxSequenceLength) {
                    // Se la sequenza corrente è più lunga della massima trovata finora, aggiorno i valori massimi
                    maxSequenceLength = currentSequenceLength;
                    startCharIndex = currentCharIndex;
                }
                // Resetto la lunghezza e l'indice di inizio della sequenza corrente
                currentSequenceLength = 0;
                currentCharIndex = -1;
            }
        }

        // Controllo se l'ultima sequenza trovata è più lunga della massima trovata finora
        if (currentSequenceLength > maxSequenceLength) {
            maxSequenceLength = currentSequenceLength;
            startCharIndex = currentCharIndex;
        }

        // Stampo i risultati
        System.out.println("lunghezza massima: " + maxSequenceLength);
        System.out.println("indice: " + startCharIndex);
    }
}
