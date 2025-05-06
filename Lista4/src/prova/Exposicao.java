package prova;

import java.util.ArrayList;
import java.util.List;

public class Exposicao {
    private String nome;
    private List<ObraArte> obras;
    public Exposicao(){
        this.obras = new ArrayList<ObraArte>();
    }
    public Exposicao(String nome){
        this.obras = new ArrayList<ObraArte>();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ObraArte> getObras() {
        return obras;
    }

    public void setObras(List<ObraArte> obras) {
        this.obras = obras;
    }
    public void addObra(ObraArte obra){
        this.obras.add(obra); // polimorfismo
    }
    public String exibeObras(){
        return this.obras.toString(); // polimorfismo
    }
    public String resumo(){
        return this.nome + this.obras.size();
    }
}
