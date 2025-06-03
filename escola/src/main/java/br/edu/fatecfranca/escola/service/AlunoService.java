package br.edu.fatecfranca.escola.service;

import br.edu.fatecfranca.escola.model.Aluno;
import br.edu.fatecfranca.escola.model.Curso;
import br.edu.fatecfranca.escola.repository.AlunoRepository;
import br.edu.fatecfranca.escola.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private AlunoRepository alunoRepository;
    private CursoRepository cursoRepository;

    public AlunoService(AlunoRepository alunoRepository, CursoRepository cursoRepository) {
        this.alunoRepository = alunoRepository;
        this.cursoRepository = cursoRepository;
    }

    // recupera os alunos
    public List<Aluno> getAlunos(){
        return alunoRepository.findAll();
    }

    // adiciona um aluno
    public Aluno addAluno(Aluno aluno){
        // verifica se o curso do aluno existe
        Curso curso =
        cursoRepository.findById(aluno.getCurso().getId()).orElse(null);
        if (curso != null){
            aluno.setCurso(curso); // define o curso completo, e não somente o id
            return alunoRepository.save(aluno);
        }
        return null;
    }
}
