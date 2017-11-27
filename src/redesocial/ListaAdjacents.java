package redesocial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ListaAdjacents{

    private final String index;
    private final ArrayList<String> table;
    private String[] column;
    private String[][] matrix;
    private int cont;

    //construtor para criação do objeto x e y são os indexes da matriz
    public ListaAdjacents(String ind) {
        this.index = ind;
        this.table = new ArrayList<>();
        this.cont = 0;
        this.matrix = new String[428][428];
    }

    //metodo responsalve pela leitura do arquivo
    private void ListaAdjacents() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(index))) {
            while (br.ready()) {
                this.table.add(br.readLine());
            }
        }
        
        //responsavel pela criação da matriz de adjacentes
        for (String line : this.table) {
            this.column = line.split(";");
            for (int i = 0; i < this.column.length; i++) {
                matrix[cont][i] = this.column[i];
            }
            cont += 1;
        }
    }
    //retorna uma matriz de adjacentes
    public String[][] getListaAdjacentes() throws IOException {
        ListaAdjacents();
        return matrix;
    }
}
