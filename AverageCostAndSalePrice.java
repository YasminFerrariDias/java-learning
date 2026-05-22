// Lê preço de custo e venda de 40 produtos, informa lucro ou perda em cada operação e calcula a média geral dos preços de custo e venda.
import java.util.Scanner;
public class MediaPrecoCustoEVenda {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double venda, custo, totalv, totalc, total, calcc, calcv;
    totalc = 0;
    totalv = 0;
    for (int i = 0; i < 40; i++) {
      System.out.print("Informe o preço de custo do produto: ");
      custo = ler.nextDouble();
      custo++;
      System.out.print("Informe o preço de venda: ");
      venda = ler.nextDouble();
      venda++;

      total = venda-custo;
      totalc += custo;
      totalv += venda;

      if (venda > custo) {
          System.out.print("Houve lucro de " + total + " reais. \n");
      } else if (venda < custo) {
          System.out.print("Houve perda de " + totalv + " reais. \n");
      } else {
          System.out.print("Houve empate de 0 reais. \n");
      }
    }
    calcc = totalc/40;
    calcv = totalv/40;
    System.out.print("A média do preço se custo é de " + calcc +". E a média do preço de venda é de " + calcv + ".");
  }
}