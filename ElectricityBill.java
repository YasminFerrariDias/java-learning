// Calcula o valor da conta de luz com base no consumo em KW e no tipo de cliente: residencial, comercial ou industrial.
import java.util.*;
public class ContaDeLuz {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double quantidade, valor; 
    char tipo;
    System.out.print("Informe a quantidade de KW utilizado: ");
    quantidade = ler.nextFloat();
    System.out.print("Informe o tipo de cliente (R - Residência, C - Comércio e I - Indústria): ");
    tipo = ler.next().charAt(0);
    if (tipo == 'R') {
      valor = quantidade*0.60;
      System.out.print("O valor da conta de luz " + valor);
    } else if (tipo == 'C') {
      valor = quantidade*0.48;
      System.out.print("O valor da conta de luz " + valor);
    } else if (tipo == 'I'){
      valor = quantidade*1.29;
      System.out.print("O valor da conta de luz " + valor);
    } else {
      System.out.print("O valor inserido é inválido.");
    }
  }
}