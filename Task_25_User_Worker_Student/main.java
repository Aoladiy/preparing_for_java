package Task_25_User_Worker_Student;

public class main {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.setName("Ivan");
        w1.setAge(25);
        w1.setSalary(1000);
        System.out.println(w1.info());
        Worker w2 = new Worker();
        w2.setName("Вася");
        w2.setAge(26);
        w2.setSalary(2000);
        System.out.println(w2.info());
        Student s1 = new Student();
        s1.setName("Вася");
        s1.setAge(26);
        s1.setSalary(2000);
        s1.setCource(2);
        s1.setStip(30000);
        System.out.println(s1.info());
    }
}
