// Calcula o salário total de um vendedor somando o salário fixo com 15% sobre o total de vendas do mês.
import java.util.Scanner;
public class SalarioDeUmVendedor {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    float fixo, total;
    double conta;
    String nome;
    System.out.print("Informe o nome do vendedor: ");
    nome = var.nextLine();
    System.out.print("Informe o sálario fixo: ");
    fixo = var.nextFloat();
    System.out.print("Informe o total de vendas em dinheiro no mês: ");
    total = var.nextFloat();
    conta = fixo + (total*0.15);
    System.out.print(nome + " recebe de sálario fixo " + fixo + " reais, e o seu sálario final é de " + conta);
  }
}