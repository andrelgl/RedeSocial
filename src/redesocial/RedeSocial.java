package redesocial;

import java.io.IOException;

/*
*Trabalho feito pelos Alunos:
*André Luiz Gomes Lages
*Felipe Brito
*/

public class RedeSocial {

    public static void main(String[] args) throws IOException {
        //passa o indereço do arquivo para o sistema junto aos padões do arquivo
        ListaAdjacents n = new ListaAdjacents("Grafo.csv", 428 , 428);
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
                    Vertice aux = new Vertice(j, 0);
                    g.getVertice().get(i).addAdjacente(aux);
                }
            }
        }
        
        //chama o mestodo respomsavel pela impressão decrescente dos valores
        g.printDecrescente();
    }
}
