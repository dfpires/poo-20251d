package exe2;
public class Aluno {
    private int nroAluno, idade;
    private String nome;
    private float p1, p2;

    public Aluno() {
        this.nome = "sem nome";
    }

    public Aluno(int nroAluno, int idade, String nome, float p1, float p2) {
        this.setNroAluno(nroAluno);
        this.setIdade(idade);
        this.setNome(nome);
        this.setP1(p1);
        this.setP2(p2);
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getNroAluno() {
        return nroAluno;
    }

    public void setNroAluno(int nroAluno) {
        // método de classe
        String aux = String.valueOf(nroAluno);
        if (aux.length() == 6) {
            this.nroAluno = nroAluno;
        }
        else System.out.println("Problema de tamanho");
    }
}
