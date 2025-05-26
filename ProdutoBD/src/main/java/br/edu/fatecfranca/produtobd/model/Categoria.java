package br.edu.fatecfranca.produtobd.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome, descricao;
    // relação ou associação entre Categoria e Produto
    @OneToMany(mappedBy = "categoria")
    @JsonIgnore
    private List<Produto> produtos;

    public Categoria() {
        produtos = new ArrayList<>();
    }

    public Categoria(Long id, List<Produto> produtos, String descricao, String nome) {
        this.id = id;
        this.produtos = produtos;
        this.descricao = descricao;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
