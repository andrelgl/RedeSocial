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
        for (Vertice ve : this.v) {
            if (ve.getID() == id) {
                return ve;
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

    //ordena a pilha inversamente
    private Pilha ordenarLista() {
        Pilha pad = new Pilha();
        for (int i = 0; i < v.size(); i++) {
            for (Vertice vertice : v) {
                if (vertice.getListaAdjacentes().size() == i) {
                    pad.Empilha(vertice);
                }
            }
        }
        return pad;
    }

    //Imprime a tabela de adjacencias em ordem decrescente
    public void printDecrescente() {
        Pilha p = ordenarLista();
        while (!p.vazia()) {
            Vertice v3 = p.Desempilha();
            System.out.println("ID:" + v3.getID());
            System.out.println("Centralidade de Grau(" + v3.getListaAdjacentes().size() + ")");
            System.out.println("Adjacentes: ");

            for (Vertice v2 : v3.getListaAdjacentes()) {
                System.out.printf("[" + v2.getID() + "],");
            }
            System.out.println("\n");
        }
    }

    //imprime o grafo com verdices e adjacentes ordenadas
    public void printGraph() {
        System.out.println("Lista de vértices: ");
        for (Vertice vertice : v) {
            System.out.println("ID: " + vertice.getID() + " Peso: " + vertice.getPeso());
        }
        //impreção da lista de adjacentes ordenadas pelo id
        System.out.println("\nLista de adjacentes: ");
        int aux = 0;

        for (Vertice vertice : v) {
            System.out.println("ID: " + vertice.getID());
            System.out.println("Centralidade de Grau(" + vertice.getListaAdjacentes().size() + ")");
            System.out.println("Adjacentes: ");

            for (Vertice adja : v.get(aux).getListaAdjacentes()) {
                System.out.printf("[" + adja.getID() + "],");
            }
            aux += 1;
            System.out.println("\n");
        }
    }
}
