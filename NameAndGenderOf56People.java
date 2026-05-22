// Lê nome e sexo de 56 pessoas, classifica cada uma e exibe a contagem total de homens e mulheres.
import java.util.Scanner;
public class NomeESexoDe56Pessoas {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String nome, sexo;
    int feminino = 0, masculino = 0;
    for (int i = 1; i < 56; i++) {
      System.out.print("Digite o nome da pessoa " + i + ": ");
      nome = ler.nextLine();
      System.out.print("Informe o sexo da pessoa (F/M) " + i + ": ");
      sexo = ler.nextLine();
      if (sexo.equalsIgnoreCase("F")) {
        System.out.print(nome + " é mulher. \n");
        feminino++;
      } else if (sexo.equalsIgnoreCase("M")){
        System.out.print(nome + " é homem. \n");
        masculino++;
      } else {
        System.out.print("Resposta inválida. Insira 'F' para feminino ou 'M' para masculino. \n");
      }
    }
    System.out.print("O  número de mulheres são de: " + feminino + ". \n");
    System.out.print("O  número de homens são de: " + masculino + ". \n");
  }
}