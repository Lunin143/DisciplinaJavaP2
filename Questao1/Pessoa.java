package Questao1;

public class Pessoa {
    protected String nome;
    protected int idade;

    public void aniversario() {
        idade++;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
