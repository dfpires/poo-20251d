package exe3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Voo {
    private int id;
    private LocalDate data;
    private String origem, destino;

    public Voo() {
    }
    public Voo(int id, String data, String origem, String destino) {
        this.id = id;
        // objeto de formatação de data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.data = LocalDate.parse(data, formatter);
        this.origem = origem;
        this.destino = destino;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Voo{" +
                "id=" + id +
                ", data=" + data +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                '}';
    }
}
