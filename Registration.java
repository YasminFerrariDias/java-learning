// Realiza um cadastro simples lendo nome, sobrenome e sexo do usuário e os exibe na tela.
import java.util.Scanner;
public class cadastro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, sobrenome, sexo;

        System.out.print("Digite seu primeiro nome: ");
        nome = ler.nextLine();
        System.out.print("Digite o sobrenome: ");
        sobrenome = ler.nextLine();
        System.out.print("Qual seu sexo 'M' ou 'F': ");
        sexo = ler.nextLine();

        System.out.print(nome+" ");
        System.out.print(sobrenome+" ");
        System.out.print(sexo+" ");
    }
}