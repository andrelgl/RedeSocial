package redesocial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AbrirArquivo {

    private final String[][] m;
    private final String index;
    private final int x;
    private final int y;
    private String linha;
    private String[] teste;

    //construtor para criação do objeto x e y são os indexes da matriz
    public AbrirArquivo(String ind, int x, int y) {
        this.index = ind;
        this.x = x - 1;
        this.y = y - 1;
        m = new String[this.x][this.y];
    }

    //metodo responsalve pela leitura do arquivo
    public void AbrirArquivo() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(index));

        while (br.ready()) {
            for (int i = 0; i < x; i++) {
                linha = br.readLine();
                for (int j = 0; j < y; j++) {
                     teste = linha.split(";");
                     m[i][j] = teste[j];
                }
            }
        }
        br.close();
        for (int f = 0; f < 427; f++) {
            for (int i = 0; i < 427; i++) {
                System.out.println(m[f][i]);
            }
            
        }
    }

    public String[][] getMatriz() {
        return this.m;
    }
}
