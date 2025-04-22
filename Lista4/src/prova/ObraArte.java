package prova;
public abstract class ObraArte {
    protected String titulo, artista;
    public ObraArte() {
    }
    public ObraArte(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "ObraArte{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", descrever=" + descrever() +
                '}';
    }

    public abstract String descrever();
}
