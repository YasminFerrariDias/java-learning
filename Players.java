// Lê as idades de 12 jogadores e informa qual é o mais velho e qual é o mais novo do grupo.
import java.util.Scanner;
public class Jogadores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] idades = new int[12];
        int maisV = Integer.MIN_VALUE;
        int maisN = Integer.MAX_VALUE;

        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a idade do jogador " + (i + 1) + ": ");
            idades[i] = ler.nextInt();

            if (idades[i] > maisV) {
                maisV = idades[i];
            }
            if (idades[i] < maisN) {
                maisN = idades[i];
            }
        }

        System.out.println("O jogador mais velho tem " + maisV + " anos.");
        System.out.println("O jogador mais novo tem " + maisN + " anos.");
  }
}
