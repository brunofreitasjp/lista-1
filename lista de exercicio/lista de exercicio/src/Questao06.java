

public class Questao06{
    public static void main(String[] args) {

        double[][] notasAlunos = new double[6][2];

        double soma =0;
        double media;
        for (int i=0; i< notasAlunos.length; i++){

            for (int j=0; j<notasAlunos[i].length; j++){
                soma += notasAlunos[i][j];
            }
            media = soma/2;



            if (soma<3){
                System.out.println(" o aluno esta reprovado ");
            } else if (soma >= 3 && soma<= 7) {
                System.out.println(" o aluno vai para o exame");
            } else if (soma > 7) {
                System.out.println("o aluno esta aprovado ");

            }
            System.out.println(" a media ");
        }


    }
}
