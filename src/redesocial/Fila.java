package redesocial;

public class Fila {

    protected Nodo inicio, fim;
    protected int tamanho;

    public Fila() {
        this.inicio = this.fim = null;
        this.tamanho = 0;
    }
    
    public boolean vazia() {
        return inicio == null;
    }
    
    void Enfileira(String s) {
        Nodo n = new Nodo(s, null);
        if (vazia())
            this.fim = this.inicio = n;
        else {
            this.fim.setNext(n);
            this.fim = n;
            this.tamanho++;
        }
            
    }
    
    public String Desenfileira(){
        Nodo aux = this.inicio;
        this.inicio = this.inicio.getNext();
        this.tamanho--;
        return aux.getElement();
    }
    
    public int tamanho() {
        return this.tamanho;
    }
    
    public String frente(){
        return this.inicio.getElement();
    }
    
    public void imprimeFila(){
        System.out.println("Fila: ");
        Nodo aux = this.inicio;
        while(aux != null){
            System.out.println(aux.getElement());
            aux = aux.getNext();
        }
    }
}

