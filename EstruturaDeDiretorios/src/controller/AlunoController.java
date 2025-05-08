package controller;
import model.Aluno;
import service.AlunoService;

import java.util.List;

public class AlunoController {
    private AlunoService alunoService = new AlunoService();

    public void cadastrarAluno(Aluno aluno) {
        alunoService.cadastrarAluno(aluno);
    }
    public List<Aluno> listarAluno() {
        return alunoService.listarAluno();
    }
    public void atualizarAluno(String nome, String novoNome) {
        alunoService.atualizarAluno(nome, novoNome);
    }
    public void deletarAluno(String nome) {
        alunoService.deletarAluno(nome);
    }