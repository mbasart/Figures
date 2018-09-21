public class Cercle extends Figura {
    private double r;

    public Cercle(){

    }

    public Cercle(double radi){
        // super es per cridar el constructor de la classe superior Figura
        super(Math.PI*radi*radi);
        this.r = radi;
    }
}
