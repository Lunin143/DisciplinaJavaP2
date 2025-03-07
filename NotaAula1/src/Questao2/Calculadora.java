package Questao2;

public class Calculadora {
    double n1, n2, soma, multi, div, sub;


    public void somar() {
        soma = n1 + n2;
        System.out.println(soma);

    }
    public void subtrair() {
        sub = n1 - n2;
        System.out.println(sub);
    }
    public void dividir() {
        div = n1 / n2;
        System.out.println(div);
    }
    public void multiplicar() {
        multi = n1 * n2;
        System.out.println(multi);
    }
}
