import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // vamos criar um objeto da classe Carro
        // instância de uma classe é um objeto
        Carro obj1 = new Carro();
        obj1.ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
        obj1.marca = JOptionPane.showInputDialog("Marca: ");
        obj1.modelo = JOptionPane.showInputDialog("Modelo: ");
        obj1.velocidade = Float.parseFloat(JOptionPane.showInputDialog("Vel: "));;
        obj1.acelerar(80);
        obj1.frear(50);
        obj1.exibeDetalhes();
        obj1.exibeDetalhes2();

        Carro obj2 = new Carro("Chevrolet", "Spin", 2023, 0);
        obj2.acelerar(80);
        obj2.frear(100);
        obj2.exibeDetalhes();
        obj2.exibeDetalhes2();

        Carro obj3 = new Carro();
        obj3.exibeDetalhes();
        obj3.exibeDetalhes2();
    }
}