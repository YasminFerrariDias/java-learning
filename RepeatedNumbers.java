// Lê 20 números, armazena os primeiros 5 e identifica quais aparecem repetidos entre eles.
import java.util.ArrayList;
import java.util.Scanner;
public class NumerosRepetidos {
      public static void main(String[] args) {
          Scanner ler = new Scanner(System.in);
          int[] numbers = new int[5];
          ArrayList<Integer> repeatedNumbers = new ArrayList<>();
  
          for (int i = 0; i < 20; i++) {
              System.out.print("Digite o número " + (i + 1) + ": ");
              numbers[i] = ler.nextInt();
          }

          for (int i = 0; i < 4; i++) {
              for (int j = i + 1; j < 5; j++) {
                  if (numbers[i] == numbers[j]) {
                      if (!repeatedNumbers.contains(numbers[i])) {
                          repeatedNumbers.add(numbers[i]);
                      }
                  }
              }
          }
  
          if (repeatedNumbers.isEmpty()) {
              System.out.print("Não há números repetidos.");
          } else {
              System.out.print("Números repetidos:  ");
              for (int num : repeatedNumbers) {
                  System.out.print(num);
              }
          }
      }
  }
  