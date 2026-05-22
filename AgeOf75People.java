// Lê a idade de 75 pessoas e informa se cada uma é maior ou menor de idade (18 anos).
import java.util.Scanner;
public class Idade75Pessoas {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int idade;
    for (int i = 1; i < 76; i++) {
      System.out.print("Digite a idade da pessoa " + i + ": ");
      idade = ler.nextInt();
      if (idade >= 18) {
        System.out.print("A pessoa " + i + " tem " + idade + " anos e é maior de idade. \n");
      } else {
        System.out.print("A pessoa "+ i +" tem " + idade + " anos e é menor de idade. \n");
      }
    }
    ler.close();
  }
}