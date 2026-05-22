// Solicita dois valores via pop-up e exibe a concatenação (junção) das duas strings resultante.
import javax.swing.JOptionPane;

public class ConcatenacaoValores {
    public static void main(String[] args) {
        
        // Solicita o primeiro valor.
        String primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor: ");

        // Solicita o segundo valor.
        String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor: ");

        // Faz o calculo dos valores.
        String resultado = primeiroValor + segundoValor;

        // Resultado da equação
        JOptionPane.showMessageDialog(null, 
        "Resultado da concatenação: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}