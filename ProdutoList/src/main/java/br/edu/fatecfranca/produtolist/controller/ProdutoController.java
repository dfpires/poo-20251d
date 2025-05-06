package br.edu.fatecfranca.produtolist.controller;

import br.edu.fatecfranca.produtolist.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // a classe responde por requisições REST
@RequestMapping("/produtos") // e o endpoint é localhost:8080/produtos
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<Produto>();

    // método que responde por um requisição GET (consulta recurso)
    @GetMapping
    public List<Produto> listaProdutos(){
        return this.produtos;
    }

    // método que responde por um requisição POST (insere recurso)
    @PostMapping
    public Produto adicionaProduto(@RequestBody Produto produto){
        // adiciona no vetor
        this.produtos.add(produto);
        return produto;
    }
    // método que responde por uma requisição DELETE (remove recurso)
    @DeleteMapping("/{id}")
    public String deletaProduto(@PathVariable Long id){
        // removeIf percorre o vetor de produtos e remove o produto
        // caso o id escolhido pelo usuário coincida com o id de prod
        boolean achou = this.produtos.removeIf( prod -> prod.getId().equals(id));
        return achou ? "Remoção com sucesso" : "Produto não existe";
    }
    // método que responde por uma requisição PUT (atualiza um recurso)
    @PutMapping("/{id}")
    public Produto atualizaProduto(@PathVariable Long id, @RequestBody Produto novo){
        // percorre o vetor para ver se o id existe
        for (Produto obj: produtos){
            if (obj.getId().equals(id)){
                obj.setNome(novo.getNome());
                obj.setPreco(novo.getPreco());
                obj.setQtde(novo.getQtde());
                return obj; // encontrou
            }
        }
        return null; // não encontrou
    }
}
