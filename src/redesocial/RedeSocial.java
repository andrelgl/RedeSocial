package redesocial;

import java.io.IOException;

public class RedeSocial {

    public static void main(String[] args) throws IOException {
        AbrirArquivo n = new AbrirArquivo("Grafo.csv", 428, 428);
        Grafo g = new Grafo();
        String[][] m;
        //enche o grafo com seus ids 
        for (int i = 0; i < 427; i++) {
            g.addVertice(i, 0);
        }
        n.AbrirArquivo();
        

        }

    }