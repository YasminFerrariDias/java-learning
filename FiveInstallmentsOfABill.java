// Divide o valor total de uma compra em cinco prestações iguais sem juros.
import java.util.Scanner;
public class CincoPrestacoesDeUmaConta {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    float compra, prest;
    System.out.print("Informe o valor total da compra: ");
    compra = var.nextFloat();
    prest = compra/5;
    System.out.print("O valor das cinco prestações sem juros será de " + prest + " reais.");
  }
}