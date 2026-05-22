// Converte um valor em dólares para reais com base na cotação informada pelo usuário.
import java.util.Scanner;
public class ConversaoDeDolarParaReal {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    float din, dolar, conv;
    System.out.print("Informe quantos dólares você possui: ");
    din = var.nextFloat();
    System.out.print("Informe a cotação do dólar: ");
    dolar = var.nextFloat();
    conv = din*dolar;
    System.out.print("A conversão ficará para " + conv + " reais.");
  }
}