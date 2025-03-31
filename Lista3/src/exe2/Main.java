package exe2;

public class Main {
    public static void main(String[] args) {
        // instância de um Student
        Student s1 = new Student(1, "João");
        // instância de um Loan e associando ao student
        Loan l1 = new Loan(11, s1);
        // adiciona 3 Books do Loan
        Book b1 = new Book(100, "Java", "A");
        Book b2 = new Book(101, "JS", "B");
        Book b3 = new Book(102, "ReacJS", "C");
        l1.addLoanItem(1000, 14, b1);
        l1.addLoanItem(1001, 14, b2);
        l1.addLoanItem(1002, 14, b3);
        System.out.println(l1);
    }
}
