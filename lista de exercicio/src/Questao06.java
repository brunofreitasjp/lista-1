/*import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        double mediaTotal = 0;
        double[] nota1= new double[6];
        double[] nota2= new double[6];
        double[] media = new double[6];

        for(int i = 0;i < 6;i++){
            Scanner scanner = new Scanner(System.in);

            System.out.println("aluno "+(i+1) +" digite a primeira nota:");
            nota1[i] = scanner.nextDouble();
            System.out.println("aluno " + (i+1) + " digite a segunda nota:");
            nota2[i] = scanner.nextDouble();



            if (media<3){
                System.out.println("o aluno "+ (i+1) + " esta reprovado");
            } else if (media>3 && media<=7) {
                System.out.println("o aluno "+ (i+1) + " vai parao exame");

            } else if (media > 7){
                System.out.println("o aluno "+ (i+1) + " esta aprovado");

            }

            media[i] = nota1[i] + nota2[i] / 2;

            mediaTotal += media[i];

        }

    }
}*/
