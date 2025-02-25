package exe2;
public class Cliente {
    public int nroAgencia, nroConta;
    public String nome;
    public float saldo;
    //construtores
    public Cliente() {
        this.nome = "sem valor";
    }
    public Cliente(int nroAgencia, int nroConta, String nome, float saldo) {
        this.nroAgencia = nroAgencia;
        this.nroConta = nroConta;
        this.nome = nome;
        this.saldo = saldo;
    }
}
