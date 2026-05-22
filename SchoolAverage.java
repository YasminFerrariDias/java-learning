// Calcula a média de três notas e informa se o aluno foi aprovado (>=7), está em recuperação (>=5.1) ou reprovado.
import java.util.Scanner;
public class MediaEscolar {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Float n1, n2, n3, media;
    String nome;
    System.out.print("Informe seu nome: ");
    nome = ler.nextLine();
    System.out.print("Informe nota 1: ");
    n1 = ler.nextFloat();
    System.out.print("Informe nota 2: ");
    n2 = ler.nextFloat();
    System.out.print("Informe nota 3: ");
    n3 = ler.nextFloat();
    media = (n1 + n2 + n3)/3;
    if (media >= 7) {
        System.out.print("O(A) aluno(a) " + nome + " foi aprovado(a) com a média " + media);
    } else if (media >= 5.1 && media < 6.9) {
        System.out.print("O(A) aluno(a) " + nome + " está de recuperação com a média " + media);
    } else {
        System.out.print("O(A) aluno(a) " + nome + " foi reprovado(a) com a média " + media);
    }
  }
}