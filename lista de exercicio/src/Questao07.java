import java.util.Scanner;

public class Questao07 {
    //7. Uma pousada estipulou o preço da diária em R$ 40,00 e mais uma taxa de serviços
    //diários de:
    //• R$ 15,00, se o número de dias for menor que 10;
    //• R$ 8,00, se o número de dias for maior ou igual a 10.
    //Criar um programa em Java que informe o nome, o valor da conta de cada cliente
    //
    //e ao final o total arrecadado pela pousada. (Comando while)

    public static void main(String[] args) {
        int maior = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a quantidade de clientes: ");
        int cliente = scanner.nextInt();

        int total = 0;
        while (cliente > 0) {

            System.out.println("digite quantos dias o cliente ficou");
            int dias = scanner.nextInt();

            if (dias >= 10) {
                maior = (dias * 8) + (dias * 40);
                System.out.println("o clitente tera que pagar: " + maior);
            } else if (dias < 10) {
                maior = (dias * 15) + (dias * 40);
                System.out.println("o clitente tera que pagar: " + maior);

            }




            cliente = cliente - 1;

        }

        System.out.println("o total arrecadado foi de : " + total);
    }
}
