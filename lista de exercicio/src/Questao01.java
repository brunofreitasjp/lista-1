import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        System.out.println("digite os creditos galaticos ");

        Scanner leitor = new Scanner(System.in);
        float credito = leitor.nextFloat();

        System.out.println("digite a porcentagem do aumento");
        float porccentagem = leitor.nextFloat();

        float result = credito + ((porccentagem / 100) * credito);

        System.out.println("o valor com o aumento e de : " + result);
    }
}
