package br.edu.fatecfranca.produtobd.repository;

import br.edu.fatecfranca.produtobd.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends
        JpaRepository<Categoria, Long> {

}
