public class Task_2 {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        double m = 85;
        double h = 1.9;
        double i = bmi.index(m, h);
        System.out.println(i);

    }
}
