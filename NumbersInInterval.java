// Lê 81 números e conta quantos estão no intervalo entre 10 e 150.
import java.util.Scanner;
public class NumerosNoIntervalo {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Integer contador, numero, intervalo;
    contador = 0;
    intervalo = 0;
    while (intervalo <= 80) {
      System.out.print("Digite um número: ");
      numero = ler.nextInt();
      intervalo++;

      if (numero >= 10 && numero <= 150) {
        contador++;
      }
    }
    System.out.print("A quantidade de números que está no intervalo de 10 e 150 são " + contador);
  }
}