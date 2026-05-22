// Recebe um número de 1 a 5 e exibe o nome por extenso em português.
import java.util.*;
public class NumeroExtenso {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int num;
    System.out.print("Informe um número de 1 á 5: ");
    num = ler.nextInt();
    if (num == 1) {
        System.out.print("O número 1 escrito por extenso é: um.");
    } else if (num == 2) {
        System.out.print("O número 2 escrito por extenso é: dois.");
    } else if (num == 3) {
        System.out.print("O número 3 escrito por extenso é: três.");
    } else if (num == 4) {
        System.out.print("O número 4 escrito por extenso é: quatro.");
    } else if (num == 5) {
        System.out.print("O número 5 escrito por extenso é: cinco.");
    } else {
        System.out.print("O número digitado é inválido.");
    }
  }
}