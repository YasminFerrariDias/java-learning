// Calcula o custo final de um carro aplicando 45% de markup e depois 28% sobre esse valor.
import java.util.*;
public class CustoDeFabricaDeUmCarro {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    float carro;
    double total, soma;
    System.out.print("Informe o preço de fábrica do carro: ");
    carro = ler.nextFloat();
    soma = (carro*45)/100;
    total = soma*28/100;
    System.out.print("O valor do carro é de " + total);
  }
}