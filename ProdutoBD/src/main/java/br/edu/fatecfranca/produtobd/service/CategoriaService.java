package br.edu.fatecfranca.produtobd.service;

import br.edu.fatecfranca.produtobd.model.Categoria;
import br.edu.fatecfranca.produtobd.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public boolean removeCategoria(Long id){
        // verifica se a categoria existe
        if (categoriaRepository.existsById(id)){
            categoriaRepository.deleteById(id);
            return true;
        }
        return false; // não encontrou categoria para remoção
    }

    public Optional<Categoria> atualizaCategoria(Long id, Categoria novo){
        return categoriaRepository.findById(id).map(cat -> {
            cat.setNome(novo.getNome());
            cat.setDescricao(novo.getDescricao());
            return categoriaRepository.save(cat); // atualiza pois cat tem id
        });
    }
}
