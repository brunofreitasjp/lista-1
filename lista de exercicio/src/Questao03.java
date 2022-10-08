import java.util.Scanner;

public class Questao03 {
    //Uma empresa decidiu dar 20% de aumento aos funcionários cujos salários são
    //inferiores a 500 reais. Escreva um programa que leia o salário de vários
    //funcionários se mostre o valor do salário reajustado ou uma mensagem caso o
    //funcionário não tenha direito ao aumento. O programa será encerrado quando se
    //digitar “fim” para o nome do funcionário. (Comando while)

    public static void main(String[] args) {



        String digita = "";
        while (digita.equals("fim") == false) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("digite o salario do funcionario");
            int salario = scanner.nextInt();

            if (salario<=500){
                salario = (int) (salario + (salario * 0.20));
                System.out.println("o salario com o aumento e de: " + salario);
            }else {
                System.out.println("o salario nao recebe aumento");
            }


            Scanner scanner2 = new Scanner(System.in);
            System.out.println("digite fim se desejar finalizar ou qualquer outra coisa para continuar");
            digita = scanner2.nextLine();


        }
    }
}
