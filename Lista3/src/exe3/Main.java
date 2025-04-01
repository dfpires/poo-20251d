package exe3;

public class Main {
    public static void main(String[] args) {

        Passageiro pa1 = new Passageiro(1, "123", "Victor");

        Voo vo1 = new Voo(2, "01/06/2025", "Ribeirão", "Guarulho");

        Reserva re1 = new Reserva(3, 7, pa1, vo1);

        System.out.println(re1.toString());
    }
}
