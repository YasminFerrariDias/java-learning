// Verifica se um número entre 92 e 1478 é primo usando divisão até a raiz quadrada.
import java.util.Scanner;
public class NumerosPrimos {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite um número: ");
        int numero = ler.nextInt();

        if (numero >= 92 && numero <= 1478) {
            boolean isPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
                System.out.println("O número " + numero + " está entre 92 e 1478 e é primo.");
            } else {
                System.out.println("O número " + numero + " está entre 92 e 1478, mas não é primo.");
            }
        } else {
            System.out.println("O número não está entre 92 e 1478.");
        }
  }
}