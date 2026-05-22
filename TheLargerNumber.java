// Compara dois números inteiros e informa qual é o maior, ou se são iguais.
import java.util.*;
public class ONumeroMaior {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int num1, num2;
    System.out.print("Informe um número: ");
    num1 = ler.nextInt();
    System.out.print("Informe um número: ");
    num2 = ler.nextInt();
    if (num1 > num2) {
        System.out.print("O número " + num1 + " é maior que " + num2);
    } else if (num1 == num2) {
        System.out.print("O número " + num1 + " é igual á " + num2);
    } else {
        System.out.print("O número " + num2 + " é maior que " + num1);
    }
  }
}