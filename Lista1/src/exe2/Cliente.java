package exe2;

import javax.swing.*;

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
    public void depositar(float valor) {
        this.saldo += valor;
    }
    public void sacar(float valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Saldo insuficiente");
        }
    }
    public void exibeDetalhes(){
        JOptionPane.showMessageDialog(null,
                "Conta: " + this.nroConta +
                " Nome: " + this.nome +
                " Saldo: " + this.saldo);
    }
}
