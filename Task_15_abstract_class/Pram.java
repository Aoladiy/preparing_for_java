package Task_15_abstract_class;

public class Pram extends Function{
    Pram(double param) {
        super(param);
    }

    public double calc(){
        return this.param*this.param;
    }
}
