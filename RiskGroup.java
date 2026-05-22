// Determina a categoria de risco de uma pessoa (1 a 9) com base na combinação de faixa etária e nível de risco informado.
import java.util.*;
public class GrupoDeRisco {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int idade;
    String nome;
    char risco;
    System.out.print("Informe o nome: ");
    nome = ler.nextLine();
    System.out.print("Informe a idade: ");
    idade = ler.nextInt();
    System.out.print("Informe o grupo de risco (1-Baixo, 2-Médio e 3-Alto): ");
    risco = ler.next().charAt(0);
    if (idade >= 17 && idade <= 20 && risco == '1') {
      System.out.print(nome + " tem " + idade + " anos e sua categoria é 1.");
    } else if (idade >= 17 && idade <= 20 && risco == '2') {
      System.out.print(nome + " tem " + idade + " anos e sua categoria é 2.");
    } else if (idade >= 17 && idade <= 20 && risco == '3') {
      System.out.print(nome + " tem " + idade + " anos e sua categoria é 3.");
    } else if (idade >= 21 && idade <= 24 && risco == '1') {
      System.out.print(nome + " tem " + idade + " anos e sua categoria é 2.");
    } else if (idade >= 21 && idade <= 24 && risco == '2') {
      System.out.print(nome + " tem " + idade + " anos e sua categoria é 3.");
    } else if (idade >= 21 && idade <= 24 && risco == '3') {
      System.out.print(nome + " tem " + idade + " anos e sua categoria é 4.");
    } else if (idade >= 25 && idade <= 34 && risco == '1') {
      System.out.print(nome + " tem " + idade + " anos e sua categoria é 3.");
    } else if (idade >= 25 && idade <= 34 && risco == '2') {
      System.out.print(nome + " tem " + idade + " anos e sua categoria é 4.");
    } else if (idade >= 25 && idade <= 34 && risco == '3') {
      System.out.print(nome + " tem " + idade + " anos e sua categoria é 5.");
    } else if (idade >= 35 && idade <= 64 && risco == '1') {
      System.out.print(nome + " tem " + idade + " anos e sua categoria é 4.");
    } else if (idade >= 35 && idade <= 64 && risco == '2') {
      System.out.print(nome + " tem " + idade + " anos e sua categoria é 5.");
    } else if (idade >= 35 && idade <= 64 && risco == '3') {
      System.out.print(nome + " tem " + idade + " anos e sua categoria é 6.");
    } else if (idade >= 65 && idade <= 70 && risco == '1') {
      System.out.print(nome + " tem " + idade + " anos e sua categoria é 7.");
    } else if (idade >= 65 && idade <= 70 && risco == '2') {
      System.out.print(nome + " tem " + idade + " anos e sua categoria é 8.");
    } else if (idade >= 65 && idade <= 70 && risco == '3') {
      System.out.print(nome + " tem " + idade + " anos e sua categoria é 9.");
    } else {
      System.out.print(nome + " não está na faixa etária necessaria (de 17 à 70 anos).");
    }
  }
}