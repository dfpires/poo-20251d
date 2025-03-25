package exe1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart {
    private int id;
    private float finalPrice;
    private Date date;
    // vamos criar um vetor de CarItem
    private List<CarItem> carItens;

    public ShoppingCart() {
        // aloca espaço na memória do vetor
        // prepara o vetor para receber itens do carrinho
        carItens = new ArrayList<>();
        this.date = new Date(); // gera hora do sistema
    }
    public ShoppingCart(int id) {
        this.id = id;
        this.date = new Date(); // gera hora do sistema
        this.carItens = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public float getFinalPrice() {
        return finalPrice;
    }

    public Date getDate() {
        return date;
    }

    public List<CarItem> getCarItens() {
        return carItens;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFinalPrice(float finalPrice) {
        this.finalPrice = finalPrice;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void addCarItem(int id, int quantity, Product product){
        // o CarItem será criado dentro do método - composição
        this.carItens.add(new CarItem(id, quantity, product));
        this.calculateFinalPrice();
    }
    public void calculateFinalPrice(){
        float soma = 0;
        for(CarItem ci: this.carItens){
            soma += ci.getQuantity() * ci.getProduct().getPrice();
        }
        this.finalPrice = soma;
    }
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", finalPrice=" + finalPrice +
                ", date=" + date +
                ", carItens=" + carItens +
                '}';
    }
}
