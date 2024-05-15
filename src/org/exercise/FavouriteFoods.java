package org.exercise;

public class FavouriteFoods {
    public static void main(String[] args) {
        String [] favouriteFoods = {"Pizza","Pasta","Pesce","Gelato","Frutta","Carne","Verdura","Sushi","Dolci","Caramelle"};

        // Stampare la lunghezza totale della classifica
        System.out.println("La lunghezza totale della classifica è: " + favouriteFoods.length);

        // Stampare il primo elemento della classifica
        System.out.println("Il primo elemento della lista è: " + favouriteFoods[0]);

        // Stampare l'ultimo elemento della classifica
        int lengthRanking = favouriteFoods.length;
        System.out.println("L'ultimo elemento della lista è: " + favouriteFoods[lengthRanking - 1]);

        // Stampare l'elemento di mezzo della classifica
        System.out.println("L'elemento di mezzo della classifica è: " + favouriteFoods[(lengthRanking / 2) - 1]);


    }
}
