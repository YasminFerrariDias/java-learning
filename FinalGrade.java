// Lê matrícula e nota final de até 76 alunos e classifica cada um com conceito de A a D conforme a nota obtida.
import java.util.Scanner;
public class NotaFinal {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int matricula;
    double notafinal;
    for (int i = 0; i <=75; i++) {
      System.out.print("Informe a matrícula do aluno: ");
      matricula = ler.nextInt();
      System.out.print("Informe a nota final do aluno: ");
      notafinal = ler.nextDouble();
      if (notafinal >= 0 && notafinal <= 4.9) {
        System.out.print("O estudante " + matricula + " ficou com a nota D.");
      } else if (notafinal >= 5 && notafinal <= 6.9) {
        System.out.print("O estudante " + matricula + " ficou com a nota C.");
      } else if (notafinal >= 7 && notafinal <= 8.9) {
        System.out.print("O estudante " + matricula + " ficou com a nota B.");
      } else if (notafinal >= 9 && notafinal <= 10) {
        System.out.print("O estudante " + matricula + " ficou com a nota A.");
      } else {
        System.out.print("Nota final está inválida. ");
      }
    }
  }
}
