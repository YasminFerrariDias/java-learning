// Lê dois números e exibe a soma entre eles.
import java.util.*;
public class SomarDoisNumeros {
  public static void main(String[] args) {
    try (Scanner var = new Scanner(System.in)) {
      float n1, n2, soma;
      System.out.print("Informe número 1: ");
      n1 = var.nextFloat();
      System.out.print("Informe número 2: ");
      n2 = var.nextFloat();
      soma = n1+n2;
      System.out.print("A soma de " + n1 + " e " + n2 + " é de " + soma);
    }
  }
}