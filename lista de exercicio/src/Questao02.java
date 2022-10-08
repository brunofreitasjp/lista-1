import java.util.Scanner;

public class Questao02 {
    //Faça um programa que leia 10 números inteiros e exiba na tela a mensagem ‘Par’
    //  se ele for um número par, ou ‘Ímpar’ se ele for um número ímpar. (Comando if).
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {

            System.out.println("digite um numero: ");
            Scanner leitor = new Scanner(System.in);
            int numero = leitor.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero + " O numero digitado e par!");
            } else {
                System.out.println(numero + " O numero digitado e impar!");
            }

            x++;
        }
    }
}