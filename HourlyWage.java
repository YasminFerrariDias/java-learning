// Calcula o salário de um funcionário multiplicando as horas trabalhadas pelo valor por hora conforme o nível (1, 2 ou 3).
import java.util.*;
public class Salario {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    Float hora, total;
    String nome;
    char nivel;
    System.out.print("Informe seu nome: ");
    nome = ler.nextLine();
    System.out.print("Informe as horas trabalhadas: ");
    hora = ler.nextFloat();
    System.out.print("Informe o nível (1/2/3): ");
    nivel = ler.next().charAt(0);
    if (nivel == '1') {
      total = hora * 12;
      System.out.print("O sálario de " + nome + " é de " + total);
    } else if (nivel == '2') {
      total = hora * 17;
      System.out.print("O sálario de " + nome + " é de " + total);
    } else if (nivel == '3'){
      total = hora * 25;
      System.out.print("O sálario de " + nome + " é de " + total);
    } else {
      System.out.print("O valor inserido não é válido. ");
    }
  }
}