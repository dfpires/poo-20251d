package br.edu.fatecfranca.produtobd.service;

import br.edu.fatecfranca.produtobd.model.Categoria;
import br.edu.fatecfranca.produtobd.model.Produto;
import br.edu.fatecfranca.produtobd.repository.CategoriaRepository;
import br.edu.fatecfranca.produtobd.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService { // aqui tem as regras de negócio
    // objeto representa a classe Produto
    private ProdutoRepository repo;
    // objeto que representa a classe Categoria
    private CategoriaRepository categoriaRepo;

    public ProdutoService(ProdutoRepository repo, CategoriaRepository categoriaRepo) {
        this.repo = repo;
        this.categoriaRepo = categoriaRepo;
    }

    // lista todos os produtos da tabela produto
    public List<Produto> listaProdutos(){
        return repo.findAll();
    }
    // adiciona um produto na tabela produto
    public Produto salvarProduto(Produto produto) {
        // verifica se a categoria associada ao produto existe
        Categoria categoria =
       categoriaRepo.findById(produto.getCategoria().getId()).orElse(null);
        // define a categoria do produto
        if (categoria == null){
            return null;
        }
        // categoria existe
        produto.setCategoria(categoria);
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
            Categoria categoria =
    categoriaRepo.findById(novo.getCategoria().getId()).orElse(null);
            p.setCategoria(categoria);
            return repo.save(p); // atualiza o produto, pois tem id
        });
    }
}
