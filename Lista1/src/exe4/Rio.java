package exe4;
public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio(){
        this.nome = "sem nome";
    }
    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    public void chover(float x){
        this.nivel += x;
    }
    public void ensolarar(float x){
        if (this.nivel >= x){
            this.nivel -= x;
        }
        else {
            System.out.println("Nível do rio não pode ser negativo");
        }
    }
    public void sujar(){
        this.poluido = true;
    }
    public void limpar(){
        this.poluido = false;
    }
    public String mostra(){
        return "Nome: " + this.nome +
                "\nNível: " + this.nivel +
                "\nPoluido: " + (this.poluido? "Sim": "Não");
    }
}
