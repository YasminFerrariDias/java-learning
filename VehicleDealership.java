// Calcula o desconto no preço de veículos: 12% para carros até 2000 e 7% para mais recentes, exibindo totais ao final.
//Yasmin Ferrari Dias 2-53
import java.util.Scanner;
public class ConcessionariaVeiculos {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int ano, carros2, geral;
    Double desconto, preco;
    String continuar;
    carros2 = 0;
    geral = 0;

    while (true) {
        System.out.print("Informe o ano do veículo: ");
        ano = ler.nextInt();
        System.out.print("Informe o preço do veículo: ");
        preco = ler.nextDouble();

        if (ano <= 2000) {
            desconto = 0.12;
            carros2++;
        } else {
            desconto = 0.07;
        }

        desconto = preco - (preco * desconto);

        System.out.print("Valor do desconto: " + desconto + "% \n");
        System.out.print("Valor a ser pago pelo cliente: " + desconto + ". \n");

        geral++;

        System.out.print("Deseja continuar calculando desconto? (S/N): \n");
        continuar = ler.next();
        if (!continuar.equalsIgnoreCase("S")) {
            break;
        }
    }
    System.out.print("Total de carros até 2000: " + carros2 + " \n");
    System.out.print("Total geral de carros: " + geral + "\n");
    
    ler.close();
  }
}
