// Pesquisa características físicas (sexo, cor dos olhos e cabelos) de 50 pessoas e exibe os totais de cada categoria.
import java.util.Scanner;

public class CaracteristicasFisicas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int masculino = 0, feminino = 0;
        int olhosAzuis = 0, olhosVerdes = 0, olhosCastanhos = 0;
        int cabelosLouros = 0, cabelosCastanhos = 0, cabelosPretos = 0;

        for (int i = 1; i <= 50; i++) {
            System.out.println("Habitante " + i);

            char sexo;
            do {
                System.out.print("Sexo (M/F): ");
                sexo = Character.toUpperCase(ler.next().charAt(0));
                if (sexo != 'M' && sexo != 'F') {
                    System.out.println("Entrada inválida. Digite M ou F.");
                }
            } while (sexo != 'M' && sexo != 'F');

            char olhos;
            do {
                System.out.print("Cor dos olhos (A/V/C): ");
                olhos = Character.toUpperCase(ler.next().charAt(0));
                if (olhos != 'A' && olhos != 'V' && olhos != 'C') {
                    System.out.println("Entrada inválida. Digite A, V ou C.");
                }
            } while (olhos != 'A' && olhos != 'V' && olhos != 'C');

            char cabelos;
            do {
                System.out.print("Cor dos cabelos (L/C/P): ");
                cabelos = Character.toUpperCase(ler.next().charAt(0));
                if (cabelos != 'L' && cabelos != 'C' && cabelos != 'P') {
                    System.out.println("Entrada inválida. Digite L, C ou P.");
                }
            } while (cabelos != 'L' && cabelos != 'C' && cabelos != 'P');

            if (sexo == 'M') masculino++;
            else feminino++;

            switch (olhos) {
                case 'A' -> olhosAzuis++;
                case 'V' -> olhosVerdes++;
                case 'C' -> olhosCastanhos++;
            }

            switch (cabelos) {
                case 'L' -> cabelosLouros++;
                case 'C' -> cabelosCastanhos++;
                case 'P' -> cabelosPretos++;
            }
        }

        System.out.println("\nResultados da pesquisa:");
        System.out.println("Sexo - Masculino: " + masculino + " pessoas");
        System.out.println("Sexo - Feminino: " + feminino + " pessoas");
        System.out.println("Cor dos olhos - Azuis: " + olhosAzuis + " pessoas");
        System.out.println("Cor dos olhos - Verdes: " + olhosVerdes + " pessoas");
        System.out.println("Cor dos olhos - Castanhos: " + olhosCastanhos + " pessoas");
        System.out.println("Cor dos cabelos - Louros: " + cabelosLouros + " pessoas");
        System.out.println("Cor dos cabelos - Castanhos: " + cabelosCastanhos + " pessoas");
        System.out.println("Cor dos cabelos - Pretos: " + cabelosPretos + " pessoas");
    }
}
