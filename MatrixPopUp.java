// Solicita dimensões e valores via pop-up para preencher uma matriz de inteiros e a exibe formatada.
import javax.swing.JOptionPane;

public class MatrizPopUp {
    public static void main(String[] args) {
        //Coletar quantas linhas e colunas vai ter
        String inputLinhas = JOptionPane.showInputDialog("Insira o número de linhas da matriz:");
        int linhas = Integer.parseInt(inputLinhas);
        String inputColunas = JOptionPane.showInputDialog("Insira o número de colunas da matriz:");
        int colunas = Integer.parseInt(inputColunas);
        int[][] matriz = new int[linhas][colunas];
        //Colocar os números nas colunas e linhas
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++){
                String inputValor = JOptionPane.showInputDialog
                ("Insira o valor para a posição[" + i +"][" + j +"]:");
                matriz[i][j] = Integer.parseInt(inputValor);
            }
        }

        //Aparece as colunas e linhas preenchidas com os números colocados acima
        StringBuilder matrizStr = new StringBuilder("Matriz preenchida:\n");
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
            matrizStr.append(matriz[i][j]).append(" ");
        }
            matrizStr.append("\n");
        }

        JOptionPane.showMessageDialog(null, matrizStr.toString());
    }

}
