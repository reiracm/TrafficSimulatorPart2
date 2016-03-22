package Logic;

public class GNodo <T> {
    
    private T valor;
    
    private GNodo<T> siguiente;

    public GNodo(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public GNodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(GNodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    
}
