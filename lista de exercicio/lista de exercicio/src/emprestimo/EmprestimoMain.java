package emprestimo;

public class EmprestimoMain {
    public static void main(String[] args) {


        Emprestimo joao = new Emprestimo();
        joao.nomeUsuario = "joao bento";
        joao.idade = 32;
        joao.valorEmprestimo = 5000;
        joao.percentualJurosMes = 30;
        joao.mesesParaPagar = 10;


        joao.imprimir();


        System.out.println("o valor a ser pago e de : " + joao.Emprestimo());
    }
}
