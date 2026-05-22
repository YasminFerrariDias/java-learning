// Gera folha de pagamento: calcula descontos de INSS e Imposto de Renda por faixas progressivas e exibe o salário líquido.
import javax.swing.JOptionPane;
public class FolhaPagamento {
    public static void main(String[] args) {
        
        //Recebe as informações dos usúarios
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");

        double salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário bruto: "));

        // Calculos e mais calculos
        double inss = calcularINSS(salarioBruto);

        double impostoDeRenda = calcularImpostoDeRenda(salarioBruto - inss);

        double salarioLiquido = salarioBruto - inss - impostoDeRenda;

        //A folha de pagamento que irá aparecer para o usúario
        String mensagem = String.format(
            "Folha de pagamento de %s:\n" +
            "Salário Bruto: R$ de %.2f\n" +
            "Desconto INSS: R$ de %.2f\n" +
            "Desconto Imposto de Renda: R$ de %.2f\n" +
            "Salário Líquido: R$ de %.2f\n",
            nome, salarioBruto, inss, impostoDeRenda, salarioLiquido);
        JOptionPane.showConfirmDialog(null, mensagem, "Folha de Pagamento",
        JOptionPane.INFORMATION_MESSAGE);
    }

    private static double calcularINSS(double salarioBruto) {
        //Calculo para saber o desconto do INSS
        double inss = 0.0;
        if (salarioBruto <= 1212.00) {
            inss = salarioBruto * 0.075;
        } else if (salarioBruto <= 2427.35) {
            inss = (1212.00 * 0.075) + ((salarioBruto - 1212.00) * 0.09);
        } else if (salarioBruto <= 3641.03) {
            inss = (1212.00 * 0.075) + ((2427.35 - 1212.00) * 0.09) + ((salarioBruto - 2427.35) * 0.12);
        } else if (salarioBruto <= 7087.22) {
            inss = (1212.00 * 0.075) + ((2427.35 - 1212.00) * 0.09) + ((3641.03 - 2427.35) * 0.12) + ((salarioBruto - 3641.03) * 0.14);
        } else {
            inss = (1212.00 * 0.075) + ((2427.35 - 1212.00) * 0.09) + ((3641.03 - 2427.35) * 0.12) + ((7087.22 - 3641.03) * 0.14);
        }
        return inss;
    }

    private static double calcularImpostoDeRenda(double salarioBase) {
        //Calculo para saber o desconto do Imposto de Renda
        double impostoDeRenda = 0.0;
        if (salarioBase <= 1903.98) {
            impostoDeRenda = 0.0;
        } else if (salarioBase <= 2826.65) {
            impostoDeRenda = (salarioBase - 1903.98) * 0.075;
        } else if (salarioBase <= 3751.05) {
            impostoDeRenda = ((2826.65 - 1903.98) * 0.075) + ((salarioBase - 2826.65) * 0.15);
        } else if (salarioBase <= 4664.68) {
            impostoDeRenda = ((2826.65 - 1903.98) * 0.075) + ((3751.05 - 2826.65) * 0.15) + ((salarioBase - 3751.05) * 0.225);
        } else {
            impostoDeRenda = ((2826.65 - 1903.98) * 0.075) + ((3751.05 - 2826.65) * 0.15) + ((4664.68 - 3751.05) * 0.225) + ((salarioBase - 4664.68) * 0.275);
        }
        return impostoDeRenda;
    }
}