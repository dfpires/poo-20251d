public class Main {
    public static void main(String[] args) {
        // vamos criar um objeto da classe Carro
        // instância de uma classe é um objeto
        Carro obj1 = new Carro();
        obj1.ano = 2022;
        obj1.marca = "Chevrolet";
        obj1.modelo = "Onix";
        obj1.velocidade = 0;
        obj1.acelerar(80);
        obj1.frear(50);
        obj1.exibeDetalhes();

        Carro obj2 = new Carro("Chevrolet", "Spin", 2023, 0);
        obj2.acelerar(80);
        obj2.frear(100);
        obj2.exibeDetalhes();

        Carro obj3 = new Carro();
        obj3.exibeDetalhes();
    }
}