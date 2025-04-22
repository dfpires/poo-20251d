package prova;

public class Main {
    public static void main(String[] args) {
        Pintura p = new Pintura("Picasso", "Van Googh", "técnica A");
        Escultura e = new Escultura("óleo", "Davi", "Michelangelo");
        Instalacao i = new Instalacao(true, "Luminária", "José");

        Exposicao exp = new Exposicao("Dia do artista");
        exp.addObra(p);
        exp.addObra(e);
        exp.addObra(i);


    }
}
