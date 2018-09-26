abstract public class Figura implements Comparable<Figura>{
    abstract public double area();

    public int compareTo (Figura fig){
        if(fig.area()<=this.area())
            return 0;
        else
            return -1;
    }
}
