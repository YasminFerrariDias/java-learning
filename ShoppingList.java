// Coleta até 11 produtos com nome, valor e quantidade, calculando o total da compra ao final.
import java.util.Scanner;
public class lista_de_compras {
    public static void main(String[] args) {
        try (Scanner compras = new Scanner(System.in)) {
            Float valor, nota;
            String nome;
            int quantidade, qtotal;
            int a = 0;
            do{
                System.out.print("Insira o nome do produto: ");
                compras.nextLine();
                System.out.print("Insira o valor: ");
                valor = compras.nextFloat();
                System.out.print("Insira a quantidade: ");
                quantidade = compras.nextInt();
                a++;
                nome = compras.nextLine();
            } while (a <= 10);
            System.out.print("Digite seu nome: ");
            nome = compras.nextLine();
            qtotal = quantidade + quantidade + quantidade + quantidade + quantidade + quantidade + quantidade + quantidade + quantidade + quantidade + quantidade;
            nota = valor * qtotal;
            System.out.print(nome + " comprou " + qtotal + " produtos, e o total é de " + nota + " reais!");
        }
    }
}
