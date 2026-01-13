package es1;

import java.util.Scanner;

public class es1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] numCasuali = new int[5];

        for (byte i = 0; i < numCasuali.length; i++) {
            int random = (int) (Math.random() * 10 + 1);
            numCasuali[i] = random;
            System.out.println(numCasuali[i]);
        }

        int input = 1;
        while (input != 0) {
            System.out.println("Scegli un numero da 1 a 5.");

            try {
                input = Integer.parseInt(scn.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Valore non valido! Hai inserito una parola o una lettera. \nInserisci un numero da 1 a 5. \nUltimo valore vallido: " + input);
            }

            if (input > 0 && input < 6) {
                System.out.println(numCasuali[input - 1]);
            } else if (input == 0) {
                break;
            } else {
                System.out.println("ATTENZIONE! " + input + " è un valore fuori dal range. \nDevi inserire un numero da 1 a 5.");
//                throw new OutOfRangeException(input);
            }
        }
        System.out.println("Programma terminato.");
    }
}
