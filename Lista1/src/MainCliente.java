import exe2.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        // cria objetos do cliente
        Cliente obj1 = new Cliente();
        obj1.depositar(2000);
        obj1.sacar(800);
        Cliente obj2 = new Cliente(123, 456, "Lucas", 0);
        obj2.depositar(3000);
        obj2.sacar(3400);
    }
}
