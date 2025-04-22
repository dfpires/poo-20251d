package prova;

public class Pintura extends ObraArte {
    private String tecnica;
    public Pintura() {
        super();
    }
    public Pintura(String tecnica, String titulo, String artista) {
        super(titulo, artista);
        this.tecnica = tecnica;
    }
    public String getTecnica() {
        return tecnica;
    }
    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }
    @Override
    public String descrever(){
        return "Pintura feita em técnica:" + this.tecnica;
    }

    @Override
    public String toString() {
        return "Pintura{" +
                super.toString() +
                "tecnica='" + tecnica + '\'' +
                '}';
    }
}
