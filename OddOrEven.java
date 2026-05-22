// Lê 30 números: conta pares nos primeiros 15 e ímpares nos últimos 15, exibindo os totais ao final.
import java.util.Scanner;
public class ImparPar {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);   
    int i, par, impar;
    Float resultado, numero;
    par = 0; impar = 0;
    for(i = 1; i <= 30; i++) {
        System.out.print("Informe algum número: ");
        numero = ler.nextFloat();
        if (i <= 15) {
            resultado = numero/2;
            if (resultado % 1 == 0) {
                par++;
            }
        }
        if (i > 15) {
            resultado = numero/2;
            if (resultado % 1 == 0) {
            } else {
                impar++;
            }
        }
    }
    System.out.print("Teve " + par + " números pares. E teve " + impar + " números impares.");
    }
}
