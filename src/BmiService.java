public class BmiService {
    public double index(double m, double h){
        double H = Math.pow(h, 2);
        return m/(H);
    }
}
