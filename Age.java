// Calcula a idade de uma pessoa com base na data de nascimento e na data atual, detectando se é aniversário.
import java.util.Scanner;
public class idade {
    public static void main(String[] args) {
        try (Scanner idade = new Scanner(System.in)) {
            String nome;
            int diaNiver, mesNiver, anoNiver, diaAtual, mesAtual, anoAtual, id, ida;
            System.out.print("Digite seu nome: ");
            nome = idade.nextLine();
            System.out.print("Informe o dia de seu nascimento: ");
            diaNiver = idade.nextInt();
            System.out.print("Informe o mês de seu nascimento: ");
            mesNiver = idade.nextInt();
            System.out.print("Informe o ano de seu nascimento: ");
            anoNiver = idade.nextInt();
            System.out.print("Informe o dia atual: ");
            diaAtual = idade.nextInt();
            System.out.print("Informe o mês atual: ");
            mesAtual = idade.nextInt();
            System.out.print("Informe o ano atual: ");
            anoAtual = idade.nextInt();
            id = anoAtual-anoNiver;
            if (diaNiver > diaAtual && mesNiver > mesAtual) {
                ida = id-1;
                System.out.print(nome + " tem " + ida + " anos.");
            } else if (diaNiver == diaAtual && mesNiver == mesAtual) {
                System.out.print(nome + " está completando " + id + " anos, parabéns!!");
            } else {
                System.out.print(nome + " tem " + id + " anos.");
            }
        }
    }
}
