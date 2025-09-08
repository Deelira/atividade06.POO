import java.util.Scanner;

public class questao04 {

    public static void Tabuada(int numero){

        for (int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.printf("%d * %d = %d\n",numero , i, resultado);
        }

    }

    public static void main(String[] args) {

        Scanner multiplicar = new Scanner(System.in);
        System.out.print("Digite o número que deseja verificar a tabuada: ");
        int numero = multiplicar.nextInt();

        Tabuada(numero);

    }

}
