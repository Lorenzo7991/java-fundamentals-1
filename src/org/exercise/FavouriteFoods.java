package org.exercise;

public class FavouriteFoods {
    public static void main(String[] args) {
        String [] favourite_foods = {"Pizza","Pasta","Pesce","Gelato","Frutta","Carne","Verdura","Sushi","Dolci","Caramelle"};

        // Stampare la lunghezza totale della classifica
        System.out.println("La lunghezza totale della classifica è: " + favourite_foods.length);

        // Stampare il primo elemento della classifica
        System.out.println("Il primo elemento della lista è: " + favourite_foods[0]);

        // Stampare l'ultimo elemento della classifica
        int length_ranking = favourite_foods.length;
        System.out.println("L'ultimo elemento della lista è: " + favourite_foods[length_ranking - 1]);

        // Stampare l'elemento di mezzo della classifica
        System.out.println("L'elemento di mezzo della classifica: " + favourite_foods[(length_ranking / 2) - 1]);


    }
}
