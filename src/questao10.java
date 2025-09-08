import java.util.Scanner;

public class questao10 {


    public static void Maior_do_Vetor(int[] numeros){

        int maior = 0;

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }

        System.out.printf("O maior número presente no vetor é %d.", maior);
    }


    public static void main(String[] args) {

        int[] numeros = new int[5];

        Scanner num = new Scanner(System.in);

        for (int i = 0; i < 5; i++ ){
            System.out.printf("Digite o %dº número: ", (i+1));
            numeros[i] = num.nextInt();
        }

        Maior_do_Vetor(numeros);

    }
}
