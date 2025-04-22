package prova;

public class Instalacao extends ObraArte{
    private boolean interativa;
    public Instalacao(){
        super();
    }
    public Instalacao(boolean interativa, String titulo, String artista){
        super(titulo, artista);
        this.interativa = interativa;
    }

    public boolean isInterativa() {
        return interativa;
    }

    public void setInterativa(boolean interativa) {
        this.interativa = interativa;
    }

    @Override
    public String toString() {
        return "Instalacao{" +
                super.toString() +
                "interativa=" + interativa +
                '}';
    }

    @Override
    public String descrever() {
        return this.interativa ?
                "Instalação Interativa": "Instalação não interativa";
    }
}
