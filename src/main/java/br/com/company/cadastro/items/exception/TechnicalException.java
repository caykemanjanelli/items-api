package br.com.company.cadastro.items.exception;

public class TechnicalException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 3697178075849536233L;

    public TechnicalException(){
        super();
    }

    public TechnicalException(String message, Throwable cause){
        super(message, cause);
    }

    public TechnicalException(String message){
        super(message);
    }

    public TechnicalException(Throwable cause){
        super(cause);
    }

}