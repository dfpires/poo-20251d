package br.edu.fatecfranca.escola.controller;

import br.edu.fatecfranca.escola.model.Curso;
import br.edu.fatecfranca.escola.repository.CursoRepository;
import br.edu.fatecfranca.escola.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    private CursoService cursoService;
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }
    @GetMapping
    public List<Curso> getCursos(){
        return cursoService.getCursos();
    }
    @PostMapping
    public Curso createCurso(@RequestBody Curso curso){
        return cursoService.addCurso(curso);
    }
}
