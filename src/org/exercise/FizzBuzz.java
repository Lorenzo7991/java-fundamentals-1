package org.exercise;

public class FizzBuzz {
    public static void main(String[] args) {
        // Itera per 100 volte
        for (int i = 1; i <= 100; i++){
            if( i % 3 == 0 && i % 5 == 0) {
                // Se i è multiplo di 3 e di 5, stampa FizzBuzz
                System.out.println("FizzBuzz");
            } else if ( i % 5 == 0){
                // Se i è multiplo di 5, stampa Buzz
                System.out.println("Buzz");
            } else if ( i % 3 == 0){
                // Se i è multiplo di 3, stampa Fizz
                System.out.println("Fizz");
            } else {
                // Se tutte le condizioni sono false, stampa il numero
                System.out.println(i);
            }
        }
    }
}
