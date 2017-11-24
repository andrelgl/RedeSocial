package redesocial;

import java.util.ArrayList;

public class Vertice {

    protected int ID;
    protected float peso;
    ArrayList<Vertice> listaAdjacentes;

    public Vertice(int ID, float peso) {
        this.ID = ID;
        this.peso = peso;
        this.listaAdjacentes = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ArrayList<Vertice> getListaAdjacentes() {
        return listaAdjacentes;
    }

    public void addAdjacente(Vertice n) {
        this.listaAdjacentes.add(n);
    }

    public void removeAdjacente(Vertice n) {
        this.listaAdjacentes.remove(n);
    }
}
