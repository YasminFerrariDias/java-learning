// Calcula o consumo médio de combustível com base na distância percorrida e litros gastos.
import java.util.*;
public class ConsumoMedioDeGasolina {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    float dist, combs, cons;
    System.out.print("Digite a distância percorrida pelo automóvel em quilômetros: ");
    dist = var.nextFloat();
    System.out.print("Digite o total de combustivel gasto: ");
    combs = var.nextFloat();
    cons = dist/combs;
    System.out.print("O consumo médio é de " + cons + " km por litro.");
  }   
}