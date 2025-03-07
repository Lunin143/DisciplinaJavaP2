package Questao1;
import java.util.Scanner;

public class MainQ1 {
    public static void main(String[] args) {

        Aluno a = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeira Nota: ");
        a.n1 = sc.nextInt();
        System.out.print("Segunda Nota: ");
        a.n2 = sc.nextInt();
        a.media();

        if (a.media >= 7) {
            System.out.print("Aluno Aprovado!!, com média " + a.media);

        } else if (a.media >= 4 && a.media < 7) {
            System.out.print("Está na Final!!, com média " + a.media);

        } else {
            System.out.print("Aluno Reprovado!!, com média " + a.media);

        }
    }
}
