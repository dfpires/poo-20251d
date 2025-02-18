import exe1.Aluno;

import javax.swing.*;

public class MainAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno();
        obj1.idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
        obj1.nroAluno = Integer.parseInt(JOptionPane.showInputDialog("Nro Aluno"));
        obj1.p1 = Float.parseFloat(JOptionPane.showInputDialog("P1"));
        obj1.p2 = Float.parseFloat(JOptionPane.showInputDialog("P2"));
        obj1.nome = JOptionPane.showInputDialog("Nome");
        obj1.dadosAluno();

      //  Aluno obj2 = new Aluno(19, 123, 6, 8.5f, "Fulano");
      //  obj2.dadosAluno();
    }
}
