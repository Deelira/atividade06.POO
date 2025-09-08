import java.util.Scanner;

public class questao02 {

    public static int Dobrar(int numero){
        return numero * 2;
    }

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Digite o número que deseja dobrar: ");
        int numero = num.nextInt();

        int resultado = Dobrar((int) numero);

        System.out.printf("O dobro do número %d é %d.", numero ,resultado);

    }

}
