// Cadastro completo com cálculo automático de idade: coleta nome, sexo, endereço, RG, CPF, salário e data de nascimento (AAAA-MM-DD), calculando a idade via LocalDate.
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class cadastro5 {
    private static String genero;

    public static void main(String[] args) {  

        // Escaneando os codigos
        Scanner ler = new Scanner(System.in); 

        // Entrada e saida de dados
          System.out.print("Digite seu primeiro nome: ");
        String nome = ler.nextLine();
          System.out.print("Digite o sobrenome: ");
        String sobrenome = ler.nextLine();
          System.out.print("Qual seu sexo 'M' ou 'F': ");
        char sexo = ler.nextLine().charAt(0);  
        
          // Definindo o genero
          if (sexo == 'M' || sexo == 'm'){
            genero = "masculino";
          } else if (sexo == 'F' || sexo == 'f') {
            genero = "feminino";
          } else {
            genero = "genero indefinido";
          }

          System.out.print("Digite se endereço: ");
        String endereco = ler.nextLine();
          System.out.print("Digite seu RG: ");
        String rg = ler.nextLine();
          System.out.print("Digite seu CPF: ");
        int cpf = ler.nextInt();
          System.out.print("Digite seu salário: ");
        double salario = ler.nextDouble(); 

        ler.nextLine();

          System.out.print("Digite o dia de seu nascimento em forma de AAAA-MM-DD: ");
        String dataNascimentoStr = ler.nextLine();
        
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr);

        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        int idade = periodo.getYears();

        // Mostrando o resultado das perguntas
      System.out.println(nome + " " + sobrenome + " é " + genero + ". Seu CPF é " + cpf + ", seu endereço é " + endereco + ". Seu salário é de " + salario + " reais. Seu RG é " + rg + ", esse ano você fará " + idade + ". Esses são seus dados.");
     ler.close();
    }
}
