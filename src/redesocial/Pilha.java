package redesocial;

public class Pilha {

    protected Nodo topo;
    protected int tamanho;

    public Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }

    void Empilha(Vertice s) {
        Nodo n = new Nodo(s, this.topo);
        this.topo = n;
        this.tamanho++;
    }

    public Vertice Desempilha() {
        Nodo aux = this.topo;
        this.topo = this.topo.getNext();
        this.tamanho--;
        return aux.getElement();
    }

    boolean vazia() {
        return topo == null;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public Vertice topo() {
        return this.topo.getElement();
    }

    public void imprimePilha() {
        System.out.println("Pilha: ");
        Nodo aux = this.topo;
        while (aux != null) {
            System.out.println(aux.getElement());
            aux = aux.getNext();
        }
    }
}
