import java.util.Scanner;

public class questao07 {

    public static void fatorial(int fatorar){

        int resultado = 0;

        System.out.println("Fatorando: ");
        int total = 0;

        for (int i = fatorar; i > 1; i--){
            resultado = fatorar * (i - 1);
            System.out.printf("%d * %d = %d\n",fatorar, (i - 1), resultado);
            total += resultado;
        }
        System.out.printf("O fatorial de %d é %d.",fatorar ,total);


    }

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.print("Digite o número para fatorar: ");
        int fatorar = numero.nextInt();

        if (fatorar == 0){
            System.out.println("O fatorial de 0 é 1");
        } else {
            fatorial(fatorar);
        }


    }

}
