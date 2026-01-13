package es1.exceptions;

public class StringInputException extends RuntimeException{

    public StringInputException(){
        super("Valore non valido! Hai inserito una parola o una lettera. \n Inserisci un numero da 1 a 5.");
    }
}
