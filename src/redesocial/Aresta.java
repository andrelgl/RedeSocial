package redesocial;

public class Aresta {

    private float peso;
    private int ID;
    private Vertice v1, v2;
    private boolean orientada;

    public Aresta(Vertice v1, Vertice v2, float peso, int ID, boolean orientada) {
        this.v1 = v1;
        this.v2 = v2;
        this.peso = peso;
        this.ID = ID;
        this.orientada = orientada;
    }

    public float peso() {
        return this.peso;
    }

    public Vertice getV1() {
        return this.v1;
    }

    public Vertice getV2() {
        return this.v2;
    }

    public float getPeso() {
        return peso;
    }

    public int getID() {
        return this.ID;
    }

    public boolean isOrientada() {
        return orientada;
    }
}
