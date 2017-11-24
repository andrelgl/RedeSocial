package redesocial;

import java.io.IOException;

public class RedeSocial {

    public static void main(String[] args) throws IOException {
        AbrirArquivo n = new AbrirArquivo("Grafo.csv", 428, 428);
        Grafo g = new Grafo();
        for (int i = 0; i < 427; i++) {
            g.addVertice(i, 0);
        }
        g.printGraph();
        for (int i = 0; i < 427; i++) {
            for (int j = 0; j < 427; j++) {
                System.out.println(n.getMatriz()[i][j]);
            }

        }

    }
}
