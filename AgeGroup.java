// Classifica uma pessoa em categorias etárias esportivas: Infantil A/B, Juvenil A/B ou Sênior.
import java.util.*;
public class FaixaEtaria {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int idade;
    System.out.print("Informe sua idade: ");
    idade = ler.nextInt();
    if (idade > 5 && idade < 7) {
      System.out.print("Sua classificação é de Infantil A.");
    } else if (idade > 8 && idade < 10) {
      System.out.print("Sua classificação é de Infantil B.");
    } else if (idade > 11 && idade < 13){
      System.out.print("Sua classificação é de Juvenil A");
    } else if (idade > 14 && idade < 17) {
      System.out.print("Sua classificação é de Juvenil B.");
    } else if (idade > 18 && idade < 25){
      System.out.print("Sua classificação é de Sênior.");
    } else {
      System.out.print("Idade fora da faixa etária. ");
    }
  }
}