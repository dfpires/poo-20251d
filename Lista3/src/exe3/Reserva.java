package exe3;

import java.util.Date;

public class Reserva  {
    private int id, validade;
    private Date data;
    // associação - agregação
    private Passageiro passageiro;
    private Voo voo;

    public Reserva() {
        this.data = new Date();
        this.passageiro = new Passageiro();
        this.voo = new Voo(); // data atual do SO
    }

    public Reserva(int id, int validade,
                   Passageiro passageiro, Voo voo) {
        this.id = id;
        this.validade = validade;
        this.data = new Date(); // data atual do SO
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", validade=" + validade +
                ", data=" + data +
                ", passageiro=" + passageiro + // toString()
                ", voo=" + voo + // toString()
                '}';
    }
    public void verificaExpiracao(){

    }
}
