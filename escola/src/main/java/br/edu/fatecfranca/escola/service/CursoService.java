package br.edu.fatecfranca.escola.service;

import br.edu.fatecfranca.escola.model.Curso;
import br.edu.fatecfranca.escola.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    CursoRepository cursoRepository;
    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    // recupera os cursos
    public List<Curso> getCursos(){
        return cursoRepository.findAll();
    }
    // adiciona curso
    public Curso addCurso(Curso curso){
        return cursoRepository.save(curso);
    }

}
