package Questao2;
import java.util.Scanner;
public class Matematica {
    public static void main (String[] args) {

        int op;
        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Número correspondente a operação básica a ser realizada:\n" +
                "1 = Soma\n" +
                "2 = Subtração\n" +
                "3 = Divisão\n" +
                "4 = Multiplicação\n");

        op = sc.nextInt();

        if(op == 1) {
            System.out.println("Digite o primeiro número: ");
            c.n1 = sc.nextDouble();
            System.out.println("Digite o segundo número: ");
            c.n2 = sc.nextDouble();
            c.somar();
        } else if (op == 2) {
            System.out.println("Digite o primeiro número: ");
            c.n1 = sc.nextDouble();
            System.out.println("Digite o segundo número: ");
            c.n2 = sc.nextDouble();
            c.subtrair();
        } else if (op == 3) {
            System.out.println("Digite o primeiro número: ");
            c.n1 = sc.nextDouble();
            System.out.println("Digite o segundo número: ");
            c.n2 = sc.nextDouble();
            c.dividir();
        } else if (op == 4) {
            System.out.println("Digite o primeiro número: ");
            c.n1 = sc.nextDouble();
            System.out.println("Digite o segundo número: ");
            c.n2 = sc.nextDouble();
            c.multiplicar();
        } else{
            System.out.println("Opção Inválida, digite 1 das 4 disponíveis!");
        }
    }
}
