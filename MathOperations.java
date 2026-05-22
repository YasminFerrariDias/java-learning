// Realiza as quatro operações matemáticas entre dois números via pop-up, tratando divisão por zero e entradas inválidas.
import javax.swing.JOptionPane;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        //Comando de instrução 
        try {
            
            //Coleta os dados
            String primeiroNumeroString = JOptionPane.showInputDialog
            ("Digite o primeiro numero (inteiro ou flutuante/real):");
            double primeiroNumero =  Double.parseDouble(primeiroNumeroString);
       
            String segundoNumeroString = JOptionPane.showInputDialog
            ("Digite o segundo número (inteiro ou flutuante/real):");
            double segundoNumero = Double.parseDouble(segundoNumeroString);
            
            //Calculos e mais calculos
            double soma = primeiroNumero + segundoNumero;
            double subtracao = primeiroNumero - segundoNumero;
            double multiplicacao = primeiroNumero * segundoNumero;
            double divisao = (segundoNumero != 0)
            ? primeiroNumero / segundoNumero : Double.NaN; // Evita divisão por zero

            //Mostra o resultado para os usuarios
            String mensagem = String.format
            ( "Resultado das operações entre %.2f e %.2f:\n", primeiroNumero, segundoNumero);
            mensagem += String.format("Soma: %.2f\n", soma);
            mensagem += String.format("Subtração: %2f\n", subtracao);
            mensagem += String.format("multiplicação: %.2f\n", multiplicacao);
            mensagem += String.format("Divisão: %s\n", 
            (segundoNumero != 0) ? String.format("%.2f", divisao) : "indefinida (divisão por zero)");
        
            JOptionPane.showMessageDialog( null,  mensagem, "Resultado das Operações",
                JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e){
            //Os dados não são válidos
            JOptionPane.showMessageDialog(null,
            "Por favor, insira um número válido", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }
}
