package br.edu.fatecfranca.produtolist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // a classe responde por requisições REST
@RequestMapping("/produtos") // e o endpoint é localhost:8080/produtos
public class ProdutoController {

    // método que responde por um requisição GET (consulta recurso)
    @GetMapping
    public String listaProdutos(){
        return "Aqui vamos listar os produtos na lista (em memória)";
    }

    // método que responde por um requisição POST (insere recurso)
    @PostMapping
    public String adicionaPoduto(){
        return "Aqui vamos adicionar um produto na lista (memória)";
    }
}
