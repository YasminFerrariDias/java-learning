// Cadastro completo: coleta nome, sobrenome, sexo, endereço, RG, CPF e salário, exibindo tudo em uma única mensagem formatada.
import java.util.Scanner;
public class cadastro3 {
    public static void main(String[] args) {  

        // Escaneando os codigos
        Scanner ler = new Scanner(System.in); 

        // Definindo as variaveis
        String nome, sobrenome, genero, endereco, rg;
        double salario;
        char sexo;
        float cpf; 

        // Entrada e saida de dados
        System.out.print("Digite seu primeiro nome: ");
        nome = ler.nextLine();
        System.out.print("Digite o sobrenome: ");
        sobrenome = ler.nextLine();
        System.out.print("Qual seu sexo 'M' ou 'F': ");
        sexo = ler.nextLine().charAt(0);
        System.out.print("Digite se endereço: ");
        endereco = ler.nextLine();
        System.out.print("Digite seu RG: ");
        rg = ler.nextLine();
        System.out.print("Digite seu CPF: ");
        cpf = ler.nextFloat();
        System.out.print("Digite seu salário: ");
        salario = ler.nextDouble();

          // Definindo o genero
          if (sexo == 'M' || sexo == 'm') {
            genero = "Masculino";
          } else if (sexo == 'F' || sexo == 'f') {
            genero = "Feminino";
          } else {
            genero = "Genero Indefinido";
          }

        // Mostrando o resultado das perguntas
      System.out.println(nome + " " + sobrenome + " é " + genero + ". Seu CPF é " + cpf + ", seu endereço é " + endereco + ". Seu salário é de " + salario + " reais. Seu RG é " + rg + ". Esses são seus dados.");
     ler.close();
    }
}