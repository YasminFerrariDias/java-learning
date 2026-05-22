// Calculadora simples que realiza soma, subtração, multiplicação ou divisão entre dois números inteiros.
import java.util.*;
public class Calculadora {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int a, b, total;
    char c;
    System.out.print("Informe o valor de A (Número): ");
    a = ler.nextInt();
    System.out.print("Informe o valor de B (Número): ");
    b = ler.nextInt();
    System.out.print("Informe o valor de C (Operação): ");
    c = ler.next().charAt(0);
    if (c == '+') {
      total = a + b;
      System.out.print(a + " + " + b + " = " + total);
    } else if (c == '-') {
      total = a - b;
      System.out.print(a + " - " + b + " = " + total);
    } else if (c == '*'){
      total = a * b;
      System.out.print(a + " * " + b + " = " + total);
    } else if (c == '/'){
      total = a / b;
      System.out.print(a + " / " + b + " = " + total);
    } else {
      System.out.print("O valor inserido não é válido. ");
    }
  }
}