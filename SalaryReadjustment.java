// Calcula o reajuste salarial de até 585 funcionários com base em faixas do salário mínimo: 50%, 20%, 15% ou 10%.
import java.util.Scanner;
public class ReajusteSalarial {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String nome;
    Float salario, salariomin, s3, s10, s20;
    Integer i;
    i = 0;
    double atual;
    while (i <= 584) {
      System.out.print("Digite seu nome: ");
      nome = ler.next();
      System.out.print("Digite o seu sálario: ");
      salario = ler.nextFloat();
      System.out.print("Digite o sálario mínimo atual: ");
      salariomin = ler.nextFloat();
      s3 = salariomin * 3;
      s10 = salariomin * 10;
      s20 = salariomin * 20;
      if (salario <= s3) {
        atual = salario + (salario * 0.50);
        System.out.print("O salário atual de " + nome +" é de " + atual + ", tendo um reajuste de 50%. \n");
      } else if (s3 <= salario && salario <= s10) {
        atual = salario + (salario * 0.20);
        System.out.print("O salário atual de " + nome +" é de " + atual + ", tendo um reajuste de 20%. \n");
      } else if (s10 <= salario && salario <= s20) {
        atual = salario + (salario * 0.15);
        System.out.print("O salário atual de " + nome +" é de " + atual + ", tendo um reajuste de 15%. \n");
      } else {
        atual = salario + (salario * 0.10);
        System.out.print("O salário atual de " + nome +" é de " + atual + ", tendo um reajuste de 10%. \n");
      }
    }
  }
}