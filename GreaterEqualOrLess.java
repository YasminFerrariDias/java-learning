// Verifica se um número é maior que 80, igual a 40, ou menor que 25.
import java.util.*;
public class MaiorIgualMenor {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int num;
    System.out.print("Informe um número: ");
    num = ler.nextInt();
    if (num > 80) {
        System.out.print("O número " + num + " é maior que 80!");
    } else if (num == 40){
        System.out.print("O número " + num + " é igual a 40!");
    } else {
        System.out.print("O número " + num + " é menor que 25!");
    }
  }
}