// Calcula o peso ideal de uma pessoa com base no sexo, altura e idade, usando fórmulas diferenciadas por perfil.
import java.util.*;
public class PesoIdeal {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    float h, idade;
    double total;
    String nome;
    char sexo;
        System.out.print("Informe seu nome: ");
        nome = ler.nextLine();
        System.out.print("Informe seu sexo (M/F): ");
        sexo = ler.next().charAt(0);
        System.out.print("Informe seu altura: ");
        h = ler.nextFloat();
        System.out.print("Informe seu idade: ");
        idade = ler.nextFloat();
        if (h > 1.70 && idade <=20) {
          total = (72.7*h) - 58;
          System.out.print("O peso ideal de " + nome + " é de " + total);
        } else if (sexo == 'M' && h > 1.70 && idade >= 21 && idade <= 39) {
          total = (72.7*h) - 53;
          System.out.print("O peso ideal de " + nome + " é de " + total);
        } else if (sexo == 'M' && h > 1.70 && idade >= 40) {
          total = (72.7*h) - 45;
          System.out.print("O peso ideal de " + nome + " é de " + total);
        } else if (sexo == 'M' && h <= 1.70 && idade <= 40) {
          total = (72.7*h) - 50;
          System.out.print("O peso ideal de " + nome + " é de " + total);
        } else if (sexo == 'M' && h <= 1.70 && idade > 40) {
          total = (72.7*h) - 58;
          System.out.print("O peso ideal de " + nome + " é de " + total);
        } else if (sexo == 'F' && h > 1.50) {
          total = (62.1*h) - 44.7;
          System.out.print("O peso ideal de " + nome + " é de " + total);
        } else if (sexo == 'F' && h <= 1.50 && idade >= 35) {
          total = (62.1*h) - 45;
          System.out.print("O peso ideal de " + nome + " é de " + total);
        } else if (sexo == 'F' && h <= 1.50 && idade < 35) {
          total = (62.1*h) - 49;
          System.out.print("O peso ideal de " + nome + " é de " + total);
        } else {
        System.out.print("Os dados inseridos estão inválidos, insira novamente.");
        }
    }
}