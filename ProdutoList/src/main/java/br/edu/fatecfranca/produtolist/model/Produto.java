package br.edu.fatecfranca.produtolist.model;

public class Produto {
    private Long id;
    private String nome;
    private float preco;
    private int qtde;

    public Produto() {

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

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qtde=" + qtde +
                '}';
    }
}
