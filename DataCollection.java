// Coleta via pop-up exemplos de quatro tipos de variáveis (String, inteiro, float e booleano) e os exibe ao usuário.
import javax.swing.JOptionPane;

public class ColetaDeDados {

    public static void main(String[] args) {
        
        // Solicita ao usuário uma string.
        String  texto = JOptionPane.showInputDialog("Digite um valor para \n uma variavel do tipo\n String'texto:'");

        // Solicita ao usuário um número inteiro.
        int inteiro = Integer.parseInt(JOptionPane.showInputDialog(
        "Digite um valor para \n uma variavel do tipo inteiro \n ex:'numero indivisivel/sem virgula'"));

        // Solicita ao usuário uma float (número divísivel).
        double pontoFlutuante = Double.parseDouble(JOptionPane.showInputDialog(
        "Digite um valor para \n uma variavel do tipo float/real \n ex:'número divísivel'"));

        // Solicita ao usuário uma escolha sobre o boleano.
        int respostaBoolean = JOptionPane.showConfirmDialog(null,
        "\"escolha uma opção para \n uma variavel do tipo boleano \n"
        ,"Escolha", JOptionPane.YES_NO_OPTION);
        boolean booleano = (respostaBoolean == JOptionPane.YES_OPTION);

        // Informa ao usúario as informações digitadas por ele.
        String mensagem = String.format
        ("var.String: %s\nvar. inteiro : %d\nvar. Float\real: %2f\nvar. boleana: %b",
        texto, inteiro, pontoFlutuante, booleano);
        JOptionPane.showMessageDialog(null, mensagem,"Dados Inseridos",
        JOptionPane.INFORMATION_MESSAGE);

    }
}