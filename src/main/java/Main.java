public class Main {
    public static void main(String[] args){
        //I create a rectangle class
        Rectangle rectangle1 = new Rectangle(3,4);
        Cercle cercle1 = new Cercle(4);
        Triangle triangle1 = new Triangle(3,3);
        Quadrat quadrat1 = new Quadrat(3);

        Figura[] fig = new Figura[4];
        fig[0]=rectangle1;
        fig[1] = cercle1;
        fig[2] = triangle1;
        fig[3] = quadrat1;

        //print out suma i ordena
        System.out.println("La suma total de les arees:" + FiguresGeometriques.suma(fig));
        FiguresGeometriques.ordena(fig);
        for(Figura f: fig) {
            System.out.println("la figura es:" + f);
        }
    }
}
