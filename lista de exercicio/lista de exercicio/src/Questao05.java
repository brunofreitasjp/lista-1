import java.util.Scanner;

public class Questao05 {
    //A prefeitura de João Pessoa abriu uma linha de crédito para os funcionários
    //municipais. O valor máximo da prestação não poderá ultrapassar 30% do salário
    //bruto. Fazer um algoritmo que permita entrar com o salário bruto e o valor da
    //prestação e informar se o empréstimo pode ou não ser concedido. (comando if)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o salario bruto do funcionario: ");
        double salario = scanner.nextDouble();

        System.out.println("digite o falor da pretacao: ");
        double prestacao = scanner.nextDouble();

        double compara = (salario * 0.30);


        if (prestacao <= compara){
            System.out.println("o valor digitado e aceito para fazer o emprestimo");
        }else {
            System.out.println("o valor nao pode ser feito o emprestimo");
        }
    }
}
