// Versão alternativa do cálculo de rendimento na poupança por 1 a 12 meses com taxa de 0,70% ao mês.
//Yasmin Ferrari Dias 2-53
import java.util.Scanner;
public class RendimentoDoValorNaPoupanca {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    float depos, mes;
    double total;
    System.out.print("Informe o valor depositado: ");
    depos = var.nextFloat();
    System.out.print("Informe quantos meses ficará na poupança (de 1 á 12): ");
    mes = var.nextFloat();
    if(mes == 1){
        total = depos*1*0.70;
        System.out.print("O rendimento foi de " + total + " reais.");
    }else if(mes == 2){
        total = depos*2*0.70;
        System.out.print("O rendimento foi de " + total + " reais.");
    }else if(mes == 3){
        total = depos*3*0.70;  
        System.out.print("O rendimento foi de " + total + " reais.");
    }else if (mes == 4){
        total = depos*4*0.70;
        System.out.print("O rendimento foi de " + total + " reais.");
    }else if(mes == 5){
        total = depos*5*0.70;
        System.out.print("O rendimento foi de " + total + " reais.");
    }else if(mes == 6){
        total = depos*6*0.70;  
        System.out.print("O rendimento foi de " + total + " reais.");
    }else if(mes == 7){
        total = depos*7*0.70;
        System.out.print("O rendimento foi de " + total + " reais.");
    }else if(mes == 8){
        total = depos*8*0.70;  
        System.out.print("O rendimento foi de " + total + " reais.");
    }else if(mes == 9){
        total = depos*9*0.70;
        System.out.print("O rendimento foi de " + total + " reais.");
    }else if(mes == 10){
        total = depos*10*0.70;
        System.out.print("O rendimento foi de " + total + " reais.");
    }else if(mes == 11){
        total = depos*11*0.70;  
        System.out.print("O rendimento foi de " + total + " reais.");
    }else if(mes == 12){
        total = depos*12*0.70;
        System.out.print("O rendimento foi de " + total + " reais.");
    }
    }
}