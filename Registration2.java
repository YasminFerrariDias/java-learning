// Versão aprimorada do cadastro: lê nome, sobrenome e sexo, e exibe o gênero por extenso (Masculino, Feminino ou Indefinido).
import java.util.Scanner;
public class cadastro2 {
    public static void main(String[] args) {  

        // Escaneando os codigos
        Scanner ler = new Scanner(System.in); 

        // Definindo as variaveis
        String nome, sobrenome, genero;
        char sexo;

        // Entrada e saida de dados
        System.out.print("Digite seu primeiro nome: ");
        nome = ler.nextLine();
        System.out.print("Digite o sobrenome: ");
        sobrenome = ler.nextLine();
        System.out.print("Qual seu sexo 'M' ou 'F': ");
        sexo = ler.nextLine().charAt(0);

          // Definindo o genero
          if (sexo == 'M' || sexo == 'm') {
            genero = "Masculino. ";
          } else if (sexo == 'F' || sexo == 'f') {
            genero = "Feminino. ";
          } else {
            genero = "Genero Indefinido. ";
          }

        // Mostrando o resultado das perguntas
        System.out.print(nome+" ");
        System.out.print(sobrenome+" ");
        System.out.print(genero+" ");
      }
}