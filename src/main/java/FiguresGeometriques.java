import java.util.Arrays;

public class FiguresGeometriques {

    public static double suma(Figura[] l){
        double sumaA=0;
        for (Figura f: l){
            sumaA += f.area();
        }
        return sumaA;
    }

    public static void ordena (Figura[] figuras){
        Arrays.sort(figuras);
    }
}
