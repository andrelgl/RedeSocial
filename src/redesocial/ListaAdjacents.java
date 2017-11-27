package redesocial;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ListaAdjacents {

    private final String index;
    private final ArrayList<String> table;
    private final String[][] matrix;
    private final int x;
    private final int y;
    private int cont;
    private String[] column;

    //construtor para criação da matriz
    public ListaAdjacents(String ind, int x, int y) {
        this.index = ind;
        this.x = x;
        this.y = y;
        this.matrix = new String[this.x][this.y];
        this.table = new ArrayList<>();
        this.cont = 0;
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
