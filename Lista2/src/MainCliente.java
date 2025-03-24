import exe1.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        Cliente obj1 =
new Cliente("7683-4", "987654-3", "Julio", 0);
        obj1.depositar(4000);
        obj1.sacar(1500);
        System.out.println(obj1.exibirCliente());
    }
}
