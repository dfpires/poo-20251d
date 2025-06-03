package br.edu.fatecfranca.escola.controller;

import br.edu.fatecfranca.escola.model.Aluno;
import br.edu.fatecfranca.escola.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private AlunoService alunoService;
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> getAlunos(){
        return alunoService.getAlunos();
    }
    @PostMapping
    public Aluno createAluno(@RequestBody Aluno aluno){
        return alunoService.addAluno(aluno);
    }
}
