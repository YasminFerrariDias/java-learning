// Verifica se um número informado é maior, igual ou menor que 10.
import java.util.*;
public class MaiorQue10 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int num;
    System.out.print("Informe um número: ");
    num = ler.nextInt();
    if (num > 10) {
        System.out.print("O número " + num + " é maior que 10!");
    } else if (num == 10){
        System.out.print("O número " + num + " é igual a 10!");
    } else {
        System.out.print("O número " + num + " é menor que 10!");
    }
  }
}