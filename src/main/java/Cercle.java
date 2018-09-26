import java.lang.Math;
public class Cercle extends Figura {
    private double r;
    private double calculA;

    public Cercle(){

    }

    public Cercle(double radi){
        this.r = radi;
    }

    public double area(){
        this.calculA = Math.PI*r*r;
        return calculA;
    }
}
