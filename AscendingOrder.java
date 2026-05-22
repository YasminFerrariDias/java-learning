// Lê três números inteiros e os exibe em ordem crescente usando ordenação de array.
import java.util.*;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[3];

        System.out.print("Informe o número 1: ");
        numeros[0] = ler.nextInt();
        System.out.print("Informe o número 2: ");
        numeros[1] = ler.nextInt();
        System.out.print("Informe o número 3: ");
        numeros[2] = ler.nextInt();

        Arrays.sort(numeros);
        System.out.print("A ordem crescente é de " + numeros[0] + ", " + numeros[1] + ", " + numeros[2] + ". ");
    }
}

