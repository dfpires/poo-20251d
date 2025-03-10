import exe3.Produto;

public class MainProduto {
    public static void main(String[] args) {
        Produto obj1 = new Produto();
        Produto obj2 = new Produto(123, 10, "sorvete de creme", 23.5f);
        System.out.println(obj2.mostra());
        obj2.descer(10);
        obj2.comprar(3);
        System.out.println(obj2.mostra());

        Produto obj3 = new Produto();
        System.out.println(obj3.mostra());
        obj3.descer(10);
        obj3.vender(3);
        System.out.println(obj3.mostra());
    }
}
