import exe4.Rio;

public class MainRio {
    public static void main(String[] args) {
        Rio obj1 = new Rio("Amazonas", 12.2f, false);
        System.out.println(obj1.mostra());
        obj1.ensolarar(2.2f);
        obj1.sujar();
        System.out.println(obj1.mostra());
    }
}
