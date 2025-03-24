import exe1.CarItem;
import exe1.Product;

public class Main {
    public static void main(String[] args) {

        // criar um objeto (instância) da classe Product
        Product prod1 = new Product(1, "Bola de Basquete",
                500);
        // criar um objeto (instância da classe CarItem
        CarItem ci1 = new CarItem(11, 3, prod1);
        // chamar o showCarItem
        System.out.println(ci1.showCarItem());

    }
}