// Calcula o IMC (peso / altura²) e classifica o resultado em: magreza, normal, sobrepeso, obesidade ou obesidade grave.
import java.util.Scanner;
public class imc {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)){
            Float peso, altura, imc;
            String nome;
            System.out.print("Digite o seu nome: ");
            nome = leia.nextLine();
            System.out.print("Informe o seu peso: ");
            peso = leia.nextFloat();
            System.out.print("Informe a sua altura: ");
            altura = leia.nextFloat();
            imc = peso/(altura*altura);
            if(imc < 18.5){
                System.out.print("O IMC de " + nome + " é de " + imc + " e está com magresa! ");
            }else if(imc >= 18.5 && imc <= 24.9){
                System.out.print("O IMC de " + nome + " é de " + imc + " e está normal!" );
            }else if(imc >= 25.0 && imc <= 29.9){
                System.out.print("O IMC de " + nome + " é de " + imc + " e está com sobrepeso! ");
            }else if(imc >= 30.0 && imc <= 39.9){
                System.out.print("O IMC de " + nome + " é de " + imc + " e está com obesidade! ");
            }else{
                System.out.print("O IMC de " + nome + " é de " + imc + " e está com obesidade grave! ");
            }
        }      
    }
}