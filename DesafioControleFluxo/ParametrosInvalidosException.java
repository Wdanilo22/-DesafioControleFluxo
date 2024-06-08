public class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(String msg){
        super("O segundo valor deve ser maior que o primeiro");
    }
}
