import exe1.CarItem;
import exe1.Product;
import exe1.ShoppingCart;

public class Main {
    public static void main(String[] args) {

        // criar um objeto (instância) da classe Product
        Product prod1 = new Product(1, "Bola de Basquete",
                500);
        Product prod2 = new Product(2, "Bola de Futebol",
                300);
        // criar um objeto (instância da classe CarItem
        // CarItem ci1 = new CarItem(11, 3, prod1);
        // chamar o showCarItem
        //System.out.println(ci1.showCarItem());
        ShoppingCart sc1 = new ShoppingCart(100);
        sc1.addCarItem(11, 3, prod1);
        sc1.addCarItem(12, 5, prod2);
        System.out.println(sc1); // chama o toString()
        // preço final da compra
        // 3 * 500 + 5 * 300 => 1500 + 1500 => 3000

    }
}