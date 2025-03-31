package exe2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Loan {
    private int id;
    private Date date;
    // associação com vetor
    private List<LoanItem> items;
    // associação
    private Student student;

    public Loan(){
        this.items = new ArrayList<LoanItem>();
        this.student = new Student();
        this.date = new Date();
    }
    public Loan(int id, Student student) {
        this.id = id;
        this.date = new Date();
        this.student = student;
        this.items = new ArrayList<LoanItem>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    // adiciona LoanItem no Loan
    public void addLoanItem(int id, int daysLoaned, Book book){
        this.items.add(new LoanItem(id, daysLoaned, book));
    }
    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", date=" + date +
                // chama toString() para cada LoanItem
                ", items=" + items +
                // chama toString() do Student
                ", student=" + student +
                '}';
    }
}
