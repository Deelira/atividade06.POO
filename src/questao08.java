import java.util.Scanner;

public class questao08 {

    public static void Primo_ou_Nao(int num){

        int contagem = 0;

        for (int i=1; i <= num; i++){
            if (num % i == 0){
                contagem += 1;
            }
        }

        if (contagem == 2){
            System.out.printf("O número %d é primo!", num);
        } else {
            System.out.printf("O número %d não é primo!", num);
        }

    }

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.print("Digite um número para verificar se ele é primo: ");
        int num = numero.nextInt();

        if (num == 0){
            System.out.println("Digite um número válido!");
        } else {
            Primo_ou_Nao(num);
        }

    }

}
