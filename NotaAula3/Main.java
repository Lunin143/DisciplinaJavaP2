package NotaAula3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Digite o Peso: ");
        p.setPeso(sc.nextDouble());
        System.out.println("Digite a Altura em centímetros: ");
        p.setAltura(sc.nextInt());
        p.calcularImc();

        if (p.getImc() < 17) {
            System.out.println("IMC muito abaixo do recomendado!");
        } else if (p.getImc() > 16.9 && p.getImc() < 18.6) {
            System.out.println("IMC abaixo do recomendado");
        } else if (p.getImc() > 18.5 && p.getImc() < 25) {
            System.out.println("IMC dentro da normalidade");
        } else if (p.getImc() > 25.1 && p.getImc() < 30) {
            System.out.println("IMC acima da normalidade");
        } else{
            System.out.println("Status de obesidade!");
        }



    }
}
