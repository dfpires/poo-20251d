import exe0.Carro;

public class MainCarro {
    public static void main(String[] args) {
        Carro obj1 = new Carro();
        // -> erro => obj1.ano = 2021; (tentamos alterar)
        obj1.setAno(2021);
        // -> erro => System.out.println("Modelo " + obj1.modelo); (tentamos acessar)
        System.out.println("Modelo: " + obj1.getModelo());

        Carro obj2 = new Carro("Fiat", "Palio", -2022, -30);
        obj2.acelerar(70);
        obj2.frear(20);
        obj2.acelerar(120);
        System.out.println("Modelo: " + obj2.exibeDetalhes());

    }
}