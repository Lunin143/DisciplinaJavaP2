//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import controller.ProfessorController;
import model.Professor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        ProfessorController professorController = new ProfessorController();
        Professor p = new Professor();

        System.out.println("Digite o nome do Professor: ");
        p.setNome(scanner.next());
        System.out.println("Digite a idade do Professor: ");
        p.setIdade(scanner.nextInt());
        System.out.println("Digite a especialização do Professor: ");
        p.setEspecializacao(scanner.next());

        professorController.cadastrarProfessor(p);
    }
}