package br.edu.fatecfranca.escola.repository;

import br.edu.fatecfranca.escola.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
