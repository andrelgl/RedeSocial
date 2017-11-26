package redesocial;

import java.util.ArrayList;

public class Grafo {

    protected ArrayList<Vertice> v;
    protected ArrayList<Aresta> a;

    public Grafo() {
        this.v = new ArrayList();
        this.a = new ArrayList();
    }

    public ArrayList<Aresta> getAresta() {
        return a;
    }

    public ArrayList<Vertice> getVertice() {
        return v;
    }

    public Vertice searchVertice(int id) {
        for (Vertice v : this.v) {
            if (v.getID()== id) {
                return v;
            }
        }
        return null;
    }

    public void addVertice(int id, float peso) {
        v.add(new Vertice(id, peso));
    }

    public void addAresta(float peso, String id, int idv1, int idv2, boolean ori) {
        //Busca vertice v1
        Vertice v1 = searchVertice(idv1);
        //Busca vertice v2;
        Vertice v2 = searchVertice(idv2);
        this.a.add(new Aresta(v1, v2, peso, id, ori));
        //quando se adciona uma aresta, deve-se atualizar a lista de adjacencias
        if (ori) {
            v1.addAdjacente(v2);
        } else {
            v1.addAdjacente(v2);
            v2.addAdjacente(v1);
        }
    }

    public void printGraph() {
        System.out.println("Lista de vértices: ");
        for (Vertice vertice : v) {
            System.out.println("ID: " + vertice.getID() + " Peso: " + vertice.getPeso());
        }
        System.out.println("Lista de arestas: ");
        for (Aresta aresta : a) {
            System.out.println("ID: " + aresta.getID() + " Peso: " + aresta.getPeso());
        }
    }
}
