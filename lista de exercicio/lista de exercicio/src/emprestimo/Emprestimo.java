package emprestimo;

public class Emprestimo {

    public String nomeUsuario;
    public int idade;
    public double valorEmprestimo;
    public double percentualJurosMes;
    public int mesesParaPagar;


    public void imprimir (){
        System.out.println(nomeUsuario);
        System.out.println(idade);
        System.out.println(valorEmprestimo);
        System.out.println(percentualJurosMes);
        System.out.println(mesesParaPagar);
    }

    public double Emprestimo(){
        if (idade >= 18 && idade < 23){
            return valorEmprestimo += (valorEmprestimo / mesesParaPagar)  * (percentualJurosMes/100);
        } else if (idade > 23 && idade <= 33) {
            return (valorEmprestimo * 10) / 100;
        }

       return 0 ;
    }
}
