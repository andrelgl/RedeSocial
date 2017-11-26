package redesocial;

import java.io.IOException;

public class RedeSocial {

    public static void main(String[] args) throws IOException {
        AbrirArquivo n = new AbrirArquivo("Grafo.csv");
        Grafo g = new Grafo();
        String[][] lista;
        //enche o grafo com seus ids 
        for (int i = 0; i < 428; i++) {
            g.addVertice(i, 0);
        }

        //estancia a lista
        lista = n.getListaAdjacentes();

        //compara caso haja adjacentes ou não
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i][j].equals("1")) {
                    g.addAresta(0, i + "," + j, i, j, false);
                }
            }
        }
        g.printGraph();
    }
}
