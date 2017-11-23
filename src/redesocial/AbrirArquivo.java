package redesocial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AbrirArquivo {

    public void AbrirArquivo() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Grafo.csv"));
        while (br.ready()) {
            String linha = br.readLine();
            System.out.println(linha);
        }
        br.close();
    }
}
