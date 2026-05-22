// Troca os valores de duas variáveis A e B entre si e exibe o resultado.
import java.util.Scanner;
public class InverterOsValoresDEAeB {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    int a, ainicial, b;
    System.out.print("Informe o número A: ");
    ainicial = var.nextInt();
    System.out.print("Informe o número B: ");
    b = var.nextInt();
    a = ainicial;
    a = b;
    b = ainicial;
    System.out.print("O valor de A é " + a + ", e o valor de B é " + b + ".");
  }
}