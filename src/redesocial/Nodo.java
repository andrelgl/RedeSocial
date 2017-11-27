package redesocial;

public class Nodo {

    private Vertice element;
    private Nodo next;

    public Nodo(Vertice s, Nodo n) {
        element = s;
        next = n;
    }

    public Vertice getElement() {
        return element;
    }

    public Nodo getNext() {
        return next;
    }

    public void setLEement(Vertice newElement) {
        element = newElement;
    }

    public void setNext(Nodo newNext) {
        next = newNext;
    }
}
