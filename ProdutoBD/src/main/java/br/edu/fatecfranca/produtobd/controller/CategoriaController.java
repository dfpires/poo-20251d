package br.edu.fatecfranca.produtobd.controller;

import br.edu.fatecfranca.produtobd.model.Categoria;
import br.edu.fatecfranca.produtobd.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    // injeção de dependência - usa um objeto sem precisar instanciá-lo
    private CategoriaService categoriaService;
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }
    @GetMapping
    public List<Categoria> listaCategorias(){
        return categoriaService.listarCategorias();
    }

    @PostMapping
    public Categoria criaCategoria(@RequestBody Categoria categoria){
        return categoriaService.salvaCategoria(categoria);
    }

    @DeleteMapping("/{id}")
    public String removeCategoria(@PathVariable Long id){
        return categoriaService.removeCategoria(id) ?
                "Remoção com sucesso" : "Categoria não encontrada";
    }

    @PutMapping("/{id}")
    public Optional<Categoria> atualizaCategoria(@PathVariable Long id,
                                                 @RequestBody Categoria categoria){

        return categoriaService.atualizaCategoria(id, categoria);
    }
}
