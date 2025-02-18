package exe1;

public class Aluno {
    public String nome;
    public int nroAluno, idade;
    public float p1, p2;
    // construtor sem parâmetros
    public Aluno(){
        this.nome = "nome não definido";
    }
    public Aluno(int idade, int nroAluno, float p1, float p2, String nome){
        this.idade = idade;
        this.nroAluno = nroAluno;
        this.p1 = p1;
        this.p2 = p2;
        this.nome = nome;
    }
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    public void dadosAluno(){
        System.out.println("Nro de aluno: " + this.nroAluno +
                " Nome: " + this.nome +
                " p1 " + this.p1 + " p2 " + this.p2 +
                " nota final " + this.notaFinal());
    }
    public String passou(){
        // operador ternário
        return (this.notaFinal() >= 6) ? "Passou" : "Não Passou";
    }
}
