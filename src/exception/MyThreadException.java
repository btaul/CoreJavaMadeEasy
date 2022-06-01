package exception;

public class MyThreadException extends RuntimeException{

    MyThreadException(){
        super("Custom Runtime Exception");
    }
}
