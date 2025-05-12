package br.edu.fatecfranca.produtobd.controller;

import br.edu.fatecfranca.produtobd.model.Produto;
import br.edu.fatecfranca.produtobd.service.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    private ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Produto> listar(){
        return service.listaProdutos();
    }

}
