public class Rectangle extends Figura {
    private double a;
    private double b;
    private double calArea;

    public Rectangle(){

    }

    public Rectangle(double base, double altura){
        this.b = base;
        this.a = altura;
    }

    public double area(){
        this.calArea = b*a;
        return calArea;
    }
}
