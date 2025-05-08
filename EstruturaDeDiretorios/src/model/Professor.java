package model;
import model.interfaces.Folha;
import enums.Classificacao;

public final class Professor extends Pessoa implements Folha {
    private String especializacao;

    public String getEspecialização() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    @Override
    public void quem_sou_eu() {
        System.out.println(Classificacao.Professor);
    }
    @Override
    public String toString() {
        return super.toString()+ "especialização=" + especializacao;
    }
    @Override
    public void calculaSalario() {
        System.out.println("(horas trabalhadas x valor hora)");
    }
}