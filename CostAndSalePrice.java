// Calcula o preço de venda de um produto aplicando um percentual de aumento sobre o preço de custo.
import java.util.*;
public class PrecoDeCustoEVenda {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    float custo, perc, total;
    String produto;
    System.out.print("Informe o produto: ");
    produto = ler.nextLine();
    System.out.print("Informe o preço de custo: ");
    custo = ler.nextFloat();
    System.out.print("Informe o percentual de aumento: ");
    perc = ler.nextFloat();
    total = custo+(custo*perc)/100;
    System.out.print("O valor de " + produto + " é de " + total);
  }
}