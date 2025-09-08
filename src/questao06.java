import java.util.Scanner;
import java.util.SortedMap;

public class questao06 {

    public static void somar(int numero){

        int resultado = 0;

        for (int i = 1; i <= numero; i++){
            resultado = numero + (i);
            System.out.printf("%d + %d = %d\n",numero, i ,resultado);
        }

        System.out.printf("O resultado total da soma é %d", resultado);

    }

    public static void main(String[] args) {

        Scanner numero_a_somar = new Scanner(System.in);
        System.out.print("Digite um número para efetuar a soma de 1 até ele mesmo: ");
        int numero = numero_a_somar.nextInt();

        somar(numero);

    }

}
