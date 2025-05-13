package br.edu.fatecfranca.produtobd.service;

import br.edu.fatecfranca.produtobd.model.Produto;
import br.edu.fatecfranca.produtobd.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService { // aqui tem as regras de negócio
    // objeto representa a classe Produto
    private ProdutoRepository repo;

    public ProdutoService(ProdutoRepository repo) {
        this.repo = repo;
    }
    // lista todos os produtos da tabela produto
    public List<Produto> listaProdutos(){
        return repo.findAll();
    }
    // adiciona um produto na tabela produto
    public Produto salvarProduto(Produto produto) {
        return repo.save(produto); // produto sem id, vai inserir
    }
    // remove um produto da tabela produto
    public boolean removerProduto(Long id) {
        if (repo.existsById(id)){ // caso exista o produto na tabela
            repo.deleteById(id); // remove o produto da tabela
            return true;
        }
        return false;
    }
    // atualiza um produto na tabela
    // o retorno será um possível objeto da classe Produto, pois o produto
    // pode não ser alterado, caso ele não exista
    public Optional<Produto> atualizaProduto(Long id, Produto novo) {
        // retorna o produto atualizado
        return repo.findById(id).map( p -> { // encontrou o produto
            // atualiza o produto com os novos dados
            p.setPreco(novo.getPreco());
            p.setNome(novo.getNome());
            p.setQtde(novo.getQtde());
            return repo.save(p); // atualiza o produto, pois tem id
        });
    }
}
