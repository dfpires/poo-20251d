package br.edu.fatecfranca.escola.repository;

import br.edu.fatecfranca.escola.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
