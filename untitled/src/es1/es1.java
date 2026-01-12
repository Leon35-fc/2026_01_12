package es1;

import es1.exceptions.OutOfRangeException;

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
            System.out.println("scegli un numero da 1 a 5.");
            input = Integer.parseInt(scn.nextLine());

            if (input >6) {
                throw new OutOfRangeException(input);
            } else {
                System.out.println(numCasuali[input - 1]);
            }
        }
        System.out.println("Programma terminato.");
    }
}
