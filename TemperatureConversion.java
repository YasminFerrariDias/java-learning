// Converte uma temperatura de Celsius para Fahrenheit usando a fórmula F = (9C + 160) / 5.
import java.util.Scanner;
public class ConversaoDeGraus {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    float C, F;
    System.out.print("Informe a temperatura: ");
    C = var.nextFloat();
    F = (9*C+160)/5;
    System.out.print("A temperatura convertida para graus é " + F);
  }
}