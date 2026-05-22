// Recebe um número de 1 a 12 e exibe o nome do mês correspondente.
import java.util.Scanner;
public class Mes {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    float mes;
    System.out.print("Informe o mês (de 1 á 12): ");
    mes = var.nextFloat();
    if(mes == 1){
        System.out.print("O mês é Janeiro.");
    }else if(mes == 2){
        System.out.print("O mês é Fevereiro.");
    }else if(mes == 3){
        System.out.print("O mês é Março.");
    }else if (mes == 4){
        System.out.print("O mês é Abril.");
    }else if(mes == 5){
        System.out.print("O mês é Maio.");
    }else if(mes == 6){
        System.out.print("O mês é Junho.");
    }else if(mes == 7){
        System.out.print("O mês é Julho.");
    }else if(mes == 8){
        System.out.print("O mês é Agosto.");
    }else if(mes == 9){
        System.out.print("O mês é Setembro.");
    }else if(mes == 10){
        System.out.print("O mês é Outubro.");
    }else if(mes == 11){  
        System.out.print("O mês é Novembro.");
    }else if(mes == 12){
        System.out.print("O mês é Dezembro.");
    } else {
        System.out.print("O número está inválido.");
    }
  }
}