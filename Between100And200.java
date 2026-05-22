// Verifica se um número informado está no intervalo entre 100 e 200 (inclusive).
import java.util.*;
public class Entre100E200 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int num;
    System.out.print("Informe um número: ");
    num = ler.nextInt();
    if (num >= 100 && num <= 200) {
        System.out.print("O número " + num + " está entre 100 e 200.");
    } else {
        System.out.print("O número " + num + " não está entre 100 e 200");
    }
  }
}