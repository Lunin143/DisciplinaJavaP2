package NotaAula3;

public class Pessoa {
    private double peso, imc;
    private int altura;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void calcularImc() {
        imc = (peso / (altura * altura)) * 10000;
        System.out.printf("O IMC da Pessoa é: %.1f \n", imc);
    }
}
