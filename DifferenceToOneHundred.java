// Calcula em loop quanto falta para um número chegar a 100, repetindo enquanto o usuário desejar.
import javax.swing.JOptionPane;

public class DiferencaParaCem {
    public static void main(String[] args) {
        //Variavel de confirmação
        int continuar = JOptionPane.YES_OPTION;

        //laço de repetição
        while(continuar == JOptionPane.YES_OPTION){        

            //Recebe um valor
            String input = JOptionPane.showInputDialog("Digite um número:");

            int numero = Integer.parseInt(input);

            //Calculo para saber quantos número falta até 100
            int diferenca = 100 - numero;

            //O que irá aparecer para o usúario
            String mensagem = "Falta " + diferenca + " para chegar a 100.";

            JOptionPane.showMessageDialog(null, mensagem);

            //Responder se quer ou não continuar o programa
            continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Continuar",
                    JOptionPane.YES_NO_OPTION);
        }
    }
}