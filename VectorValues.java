// Coleta quatro valores via pop-up, armazena em um vetor e os exibe listados ao usuário.
import javax.swing.JOptionPane;

public class VetorValores {
    public static void main(String[] args) {
        
        String[] valores = new String[4];

        //O usúario informa os dados
        for (int i = 0; i < valores.length; i++) {
            valores[i] = JOptionPane .showInputDialog("Digite o valor " + (i + 1) + ":");
        }

        //Laço de repetição
        StringBuilder mensagem = new StringBuilder("Valores digitados:\n");
        for (int i = 0; i < valores.length; i++) {
            mensagem.append("Valor ").append(i + 1).append(": ").append(valores[i]).append("\n");
        }

        //Mostra ao usúario os dados colocados
        JOptionPane.showMessageDialog(null, mensagem.toString(), "Valores Digitados",
         JOptionPane.INFORMATION_MESSAGE);
    }
}
