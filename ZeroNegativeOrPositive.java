// Lê números em loop e classifica cada um como zero, negativo ou positivo, até o usuário optar por parar.
import java.util.Scanner;
public class IgualNegativoPositivo {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Float numero;
    char continuar;
    while (true) {
      System.out.print("Informe algum número: ");
      numero = ler.nextFloat();

        if (numero == 0) {
          System.out.print("Este número é igual a 0. \n");
        } else if (numero < 0){
          System.out.print("Este número é negativo. \n");
        } else {
            System.out.print("Este número é positivo. \n");
        }

        System.out.print("Deseja continuar? (S/N): \n");
        continuar = ler.next().charAt(0);
          if (continuar == 'n') {
            break;
          }
        }
    ler.close();
  }
}