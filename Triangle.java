// Recebe os três lados de um triângulo e classifica como Equilátero, Isóscele ou Escaleno.
import java.util.*;
public class Triangulo {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int n1, n2, n3;
    System.out.print("Informe o lado 1 do triângulo: ");
    n1 = ler.nextInt();
    System.out.print("Informe o lado 2 do triângulo: ");
    n2 = ler.nextInt();
    System.out.print("Informe o lado 3 do triângulo: ");
    n3 = ler.nextInt();
    if (n1 == n2 && n2 == n3) {
      System.out.print("É um triângulo Equilátero.");
    } else if (n1 != n2 && n2 != n3) {
      System.out.print("É um triângulo Escaleno.");
    } else if (n1 == n2 && n2 != n3) {
      System.out.print("É um triângulo Isóscele. ");
    } else if (n1 != n2 && n2 == n3) {
      System.out.print("É um triângulo Isóscele. ");
    } else {
      System.out.print("Os valores inseridos não são válidos.");
    }
  }
}