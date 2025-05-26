package br.edu.fatecfranca.produtobd.service;

import br.edu.fatecfranca.produtobd.model.Categoria;
import br.edu.fatecfranca.produtobd.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    // injeção de dependência
    private CategoriaRepository categoriaRepository;
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> listarCategorias(){
        return categoriaRepository.findAll();
    }

    public Categoria salvaCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }
}
