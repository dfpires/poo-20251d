package br.edu.fatecfranca.produtobd.repository;

import br.edu.fatecfranca.produtobd.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

// uma classe interface todos os métodos são abstratos
// essa interface vai herdar uma outra interface, chamada JpaRepository
// a interface JpaRepository tem todos os métodos de banco de dados da classe
// Produto, que tem como chave primária uma variável do tipo Long
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // portanto, a interface ProdutoRepository tem os métodos de banco de dados
    // da classe Produto, como exemplo, métodos para fazer o CRUD
    // create, retrieve, update e delete
    // findAll(), save(), deleteById(), etc
}
