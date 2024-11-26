import exception.AritmeticaException;

public interface Aritmetica<T> {

    public T add(T f);
    public T multiply(T f) throws AritmeticaException;
    public T subtract(T f) throws AritmeticaException;
    public T divide(T f);
    
}
