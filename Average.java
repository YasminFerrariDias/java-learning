// Calcula a média de quatro notas e informa se o aluno foi aprovado (>=6), está em recuperação (>=3) ou reprovado.
import java.util.Scanner;
//o try foi adicionado para "corrigir" um erro do VAR, que estava aparecendo como errada.
class media {
    public static void main(String[] args) {
        try (Scanner var = new Scanner(System.in)) {
            Float n1, n2, n3, n4, media;
            String nome;
            System.out.print("Digite seu nome: ");
            nome = var.nextLine();
            System.out.print("Informe nota 1: ");
            n1 = var.nextFloat();
            System.out.print("Informe nota 2: ");
            n2 = var.nextFloat();
            System.out.print("Informe nota 3: ");
            n3 = var.nextFloat();
            System.out.print("Informe nota 4: ");
            n4 = var.nextFloat();
            media = (n1 + n2 + n3 + n4) / 4;
            if (media >= 6) {
                System.out.print("O(A) aluno(a) " + nome + " foi aprovado(a) com a média " + media);
            } else if (media >= 3 && media < 6) {
                System.out.print("O(A) aluno(a) " + nome + " está de recuperação com a média " + media);
            } else {
                System.out.print("O(A) aluno(a) " + nome + " foi reprovado(a) com a média " + media);
            }
        }
    }
}