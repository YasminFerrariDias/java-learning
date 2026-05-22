// Calcula a média final ponderada: trabalho (peso 2), avaliação semestral (peso 3) e exame final (peso 5).
import java.util.Scanner;
public class MediaFinalProvas {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Float n1, n2, n3, tra, ava, exa, total, media;
    String nome;
    System.out.print("Digite seu nome: ");
    nome = ler.nextLine();
    System.out.print("Informe nota 1 (Trabalho de Laboratório): ");
    n1 = ler.nextFloat();
    System.out.print("Informe nota 2 (Avaliação Semestral): ");
    n2 = ler.nextFloat();
    System.out.print("Informe nota 3 (Exame Final): ");
    n3 = ler.nextFloat();
    tra = n1*2;
    ava = n2*3;
    exa = n3*5;
    total = tra+ava+exa;
    media = total/10;
    System.out.print("A média final de " + nome + " é de " + media);
  }
}