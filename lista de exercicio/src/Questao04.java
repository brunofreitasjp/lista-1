import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {

        System.out.println("digite a quantidade de litros que foi colocado ");

        Scanner leitor = new Scanner(System.in);
        float litros = leitor.nextFloat();

        float gasolina = (float) (litros * 2.50);

        System.out.println("o valor do combustivel a ser pago e de :" + gasolina);

        float refrigerante = 6;

        float total = gasolina + refrigerante;
        System.out.println("o valor total a ser pago e de : " + total);
    }
}
