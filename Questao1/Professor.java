package Questao1;

public class Professor {
    private double salario;
    public void calcularSalario(){
        salario = 300*40;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
