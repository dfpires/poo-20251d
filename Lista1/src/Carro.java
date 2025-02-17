public class Carro {
    // variáveis são fortemente tipadas
    // int é um tipo primitivo de dados
    public int ano, velocidade;
    // String é um tipo de dados do tipo classe
    public String marca, modelo;

    // métodos construtores
    public Carro(){
        this.marca = "indefinido";
        this.modelo = "indefinido";
    }
    public Carro(String marca, String modelo, int ano, int velocidade){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = velocidade;
    }
    // métodos
    public void exibeDetalhes(){
        // this representa o objeto que chama o método
        System.out.println("Marca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nAno: " + this.ano +
                "\nVelocidade: " + this.velocidade +
                "\n ###################################");
    }

}
