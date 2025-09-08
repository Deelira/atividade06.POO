import java.util.Scanner;

public class questao01 {

    public static boolean Par(int numero) {
        if (numero % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Digite um número para verificar se é Par ou Ímpar: ");
        int numero =  num.nextInt();

        boolean resultado = Par(numero);

        System.out.printf("O número %d é Par? %b", numero, resultado);
    }

}
