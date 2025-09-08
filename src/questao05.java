import java.util.Scanner;

public class questao05 {

    public static void Saudacao(String nome){

        System.out.printf("\nOlá, %s. \nSeja bem vindo(a)!", nome);

    }

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        System.out.print("Qual o seu nome? ");
        String nome = usuario.nextLine();

        Saudacao(nome);

    }

}
