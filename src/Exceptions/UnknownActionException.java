package Exceptions;

//Checked exception
public class UnknownActionException extends Exception{
    public UnknownActionException(String message){
        super(message);
    }
}
