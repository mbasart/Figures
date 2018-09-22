public class Triangle extends Figura{
    private double a;
    private double b;
    private double calculArea;

    public Triangle(){

    }

    public Triangle(double base1, double altura1){
        this.b = base1;
        this.a = altura1;
    }

    public double area(){
        this.calculArea = (a*b)/2;
        return calculArea;
    }
}
