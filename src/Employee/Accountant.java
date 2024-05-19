package Employee;

public class Accountant extends Employee{
    private char gruppa;


    public Accountant(String surname, String sex, int age, int salary, char gruppa) {
        super(surname, sex, age, salary);
        this.gruppa = gruppa;
    }

    public void setGruppa(char gruppa) {
        if (gruppa == 'A' || gruppa =='B' ||  gruppa =='C' ||  gruppa =='D' ||  gruppa =='E') {
            this.gruppa = gruppa;
        } else {
            System.out.println("Неверная группа профстандарта бухгалтера.");
        }
    }

    public char getGruppa() {
        return gruppa;
    }

    @Override
    public void show() {
        System.out.printf( "%s;%s;%d;%d;%s\n", super.getSurname(), super.getSex(), super.getAge(), super.getSalary(),gruppa);
    }
}
