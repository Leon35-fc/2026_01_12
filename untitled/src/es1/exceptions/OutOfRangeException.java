package es1.exceptions;

public class OutOfRangeException extends RuntimeException{

    public OutOfRangeException(int val){
        super("Il valore " + val + " non è un valore valido. \n Inserisci un valore da 1 a 5.");
    }
}
