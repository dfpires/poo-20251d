package br.edu.fatecfranca.produtobd.model;
import jakarta.persistence.*;
@Entity // entidade do banco de dados
public class Produto {
    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gerado automaticamente
    private Long id;
    private String nome;
    private float preco;
    private int qtde;

    // relação ou associação entre Categoria e Produto
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Produto(){

    }

    public Produto(Long id, String nome, float preco, int qtde, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
        this.categoria = categoria;
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
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
