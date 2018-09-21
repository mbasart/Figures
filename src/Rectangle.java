public class Rectangle extends Figura {
    private double a;
    private double b;

    public Rectangle(){

    }

    public Rectangle(double base, double altura){
        // super es per cridar el constructor de la classe superior Figura
        super(base*altura);
        this.b = base;
        this.a = altura;
    }
}
