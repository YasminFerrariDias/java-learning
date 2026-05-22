// Calcula o salário líquido de um funcionário somando bônus com base no sexo e idade ao salário fixo.
import java.util.Scanner;
public class SalarioLiquido {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String nome;
    float total, salario;
    char sexo; 
    int idade;
      System.out.print("Informe o nome: ");
      nome = ler.nextLine();
      System.out.print("Informe a idade: ");
      idade = ler.nextInt();
      System.out.print("Informe o sexo (m/f): ");
      sexo= ler.next().charAt(0);
      System.out.print("Informe o salário fixo: ");
      salario = ler.nextFloat();

        if (idade >= 30 && sexo == 'm') {
          total = salario + 100;
          System.out.print("O salário líquido de " + nome + " é de " + total);
        } else if (idade < 30 && sexo == 'm') {
          total = salario + 50;
          System.out.print("O salário líquido de " + nome + " é de " + total);
        } else if (idade >= 30 && sexo == 'f') {
          total = salario + 200;
          System.out.print("O salário líquido de " + nome + " é de " + total);
        } else {
          total = salario + 200;
          System.out.print("O salário líquido de " + nome + " é de " + total);
        }
    }
}