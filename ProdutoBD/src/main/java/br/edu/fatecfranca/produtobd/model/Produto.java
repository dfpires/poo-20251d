package br.edu.fatecfranca.produtobd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // entidade do banco de dados
public class Produto {
    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerado automaticamente
    private Long id;

    private String nome;
    private float preco;
    private int qtde;

    public Produto(){

    }

    public Produto(Long id, String nome, float preco, int qtde) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
}
