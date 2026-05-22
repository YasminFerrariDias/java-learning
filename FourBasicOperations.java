// Realiza as quatro operações matemáticas básicas (soma, subtração, divisão e multiplicação) entre dois números.
import java.util.*;
public class AsQuatroOperacoes {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    float n1, n2, soma, div, sub, mult;
    System.out.print("Informe número 1: ");
    n1 = var.nextFloat();
    System.out.print("Informe número 2: ");
    n2 = var.nextFloat();
    soma = n1+n2;
    sub = n1-n2;
    div = n1/n2;
    mult = n1*n2;
    System.out.println("A soma de " + n1 + " e " + n2 + " é de " + soma);
    System.out.println("A subtração de " + n1 + " e " + n2 + " é de " + sub);
    System.out.println("A divisão de " + n1 + " e " + n2 + " é de " + div);
    System.out.println("A multiplicação de " + n1 + " e " + n2 + " é de " + mult);
  }
}