package prova;

public class Main {
    public static void main(String[] args) {
        Pintura p = new Pintura("Picasso", "Van Googh", "técnica A");
        Escultura e = new Escultura("óleo", "Davi", "Michelangelo");


        Exposicao exp = new Exposicao("Dia do artista");
        exp.addObra(p);
        exp.addObra(e);
        exp.exibeObras();
        exp.resumo();


    }
}
