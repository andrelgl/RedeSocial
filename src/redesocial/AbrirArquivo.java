package redesocial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class AbrirArquivo {

    private String[][] m; 
    private String index;
    private int x;
    private int y;

    public AbrirArquivo(String ind, int x, int y) {
        this.index = ind;
        this.x = x-1;
        this.y = y-1;
        m = new String[this.x][this.y];
    }

    public void AbrirArquivo() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(index));

        while (br.ready()) {
            String linha = br.readLine();
            String lin[] = linha.split(";");
            for(int i = 0; i < this.x; i++){
                System.out.println(lin[i]);
                /*for(int j = 0; i < this.y; i++){
                    this.m[i][j] = lin[j];
                }*/
            }
            
        }
        br.close();
        
    }
    
    public String[][] getMatriz(){
        return this.m;
    }
}
