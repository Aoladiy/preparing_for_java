package Task_25_User_Worker_Student;

public class Student extends Worker{
    private int cource;
    private double stip;

    public int getCource() {
        return cource;
    }

    public void setCource(int cource) {
        this.cource = cource;
    }

    public double getStip() {
        return stip;
    }

    public void setStip(double stip) {
        this.stip = stip;
    }

    public String info(){
        return this.name + " " + this.age + " " + this.salary + " " + this.cource + " " + this.stip;
    }
}
