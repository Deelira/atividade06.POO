import java.util.Scanner;

public class questao03 {

    public static int Maior_ou_Menor(int numero1, int numero2) {

        int maior = 0;

        if (numero1 > numero2) {
            maior = numero1;
        } else if (numero2 > numero1) {
            maior = numero2;
        }

        return maior;
    }

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        int[] numeros = new int[2];

        for (int i = 0; i < 2; i++){
            System.out.printf("Digite o %dº número: ", i+1);
            numeros[i] = numero.nextInt();
        }

        int numero1 = numeros[0];
        int numero2 = numeros[1];

        int resultado = Maior_ou_Menor(numero1,numero2);

        System.out.printf("O número maior entre eles é o %d.", resultado);

    }

}
