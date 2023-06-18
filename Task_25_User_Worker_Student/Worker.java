package Task_25_User_Worker_Student;

public class Worker extends User {
    double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return this.name + " " + this.age + " " + this.salary;
    }
}
