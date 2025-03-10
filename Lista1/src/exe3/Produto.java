package exe3;
public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;

    public Produto(){
        this.descricao = "sem descrição";
    }
    public Produto(int id, int qtde, String descricao, float preco){
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }
    public void comprar(int x){
        this.qtde += x;
        System.out.println("Compra com sucesso");
    }
    public void vender(int x){
        if (this.qtde >= x){
            this.qtde -= x;
            System.out.println("Venda com sucesso");
        }
        else {
            System.out.println("Estoque insuficiente");
        }
    }
}
