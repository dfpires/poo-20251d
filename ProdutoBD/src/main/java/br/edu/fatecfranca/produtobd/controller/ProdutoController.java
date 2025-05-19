package br.edu.fatecfranca.produtobd.controller;

import br.edu.fatecfranca.produtobd.model.Produto;
import br.edu.fatecfranca.produtobd.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController { // não existe regra de negócio aqui


    private ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Produto> listar(){
        return service.listaProdutos();
    }

    @PostMapping
    public Produto adicionar(@RequestBody Produto produto) {
        return service.salvarProduto(produto);
    }

    @DeleteMapping("/{id}")
    public String remover(@PathVariable Long id) {
        return service.removerProduto(id) ?
                "Remoção com sucesso": "Produto não encontrado";
    }

    @PutMapping("/{id}")
    public Optional<Produto> atualizar(@PathVariable Long id, @RequestBody Produto novo) {
        return service.atualizaProduto(id, novo);
    }
}
