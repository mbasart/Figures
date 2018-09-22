public class Quadrat extends Rectangle {
    private double costat;

    public Quadrat(double costat){
        //super apunta a la classe de sobre i aprofito els costats del rectangle
        super(costat,costat);
    }
}
