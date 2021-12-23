package model;
public class IllegalLoginException extends Exception {

    IllegalLoginException() {
        super("Login already exists, try again: ");
    }
}