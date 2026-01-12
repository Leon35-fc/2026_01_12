package es2;

import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Inserisci i chilometri percorsi.");
        int km = scn.nextInt();
        System.out.println("Inserisci i litri di carburante usato.");
        int lt = scn.nextInt();

        System.out.println(km/lt);
    }
}
