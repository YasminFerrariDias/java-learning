// Verifica se uma pessoa está apta ao serviço militar: deve ser do sexo masculino, ter 18 anos ou mais e não ter problemas de saúde.
import java.util.Scanner;
public class AptoParaServicoMilitar {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String nome;
    char sexo, saude; 
    int total, idade, quantidade, i;
    total = 0;
    System.out.print("Deseja verificar de quantas pessoas? ");
    quantidade = ler.nextInt();
    for (i = 1; i <= quantidade; i++) {
      System.out.print("Informe o nome: ");
      nome = ler.next();
      System.out.print("Informe o sexo (m/f): ");
      sexo= ler.next().charAt( 0);
      System.out.print("Informe a idade: ");
      idade = ler.nextInt();
      System.out.print("Informe se tem algum problema de saúde (s/n): ");
      saude = ler.next().charAt(0);

      if (idade >= 18 && sexo == 'm' &&  saude == 'n') {
        System.out.print(nome + " está apto a cumprir o serviço militar. \n");
        total++;
      } else {
        System.out.print(nome + " não está apto a cumprir o serviço militar. \n");
      }
    }
    System.out.print("O total de pessoas que estão aptas para cumprir o cerviço militar é de " + total);

    ler.close();
  }
}