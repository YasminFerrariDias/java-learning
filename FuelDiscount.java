// Calcula o desconto no preço de um veículo com base no tipo de combustível: álcool (25%), gasolina (21%) ou diesel (14%).
import java.util.*;
public class Combustivel {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Float valor;
    double total;
    int combs;
    System.out.print("Informe o valor do veículo: ");
    valor = ler.nextFloat();
    System.out.print("Informe o combustível (1: álcool, 2: gasolina, 3: diesel): ");
    combs = ler.nextInt();
    if (combs == 1) {
      total = valor - (valor*0.25);
      System.out.print("Teve 25% de desconto e o valor total a ser pago é de " + total);
    } else if (combs == 2) {
      total = valor - (valor*0.21);
      System.out.print("Teve 21% de desconto e o valor total a ser pago é de " + total);
    } else if (combs == 3){
      total = valor - (valor*0.14);
      System.out.print("Teve 14% de desconto e o valor total a ser pago é de " + total);
    } else {
      System.out.print("O valor inserido não é válido. ");
    }
  }
}