public class Wave {
    static double wave1(double x) {
        double sum = 0;
        int kmax = 100;
        for (int k = 1; k <= kmax; k += 2) {
            sum += Math.sin(k*x) / k;
        }
        return sum;
    }
    public static void main(String[] args) {
        Plot plot = new Plot("Sin Function", 0, 4 * Math.PI, Math.PI / 18, -2, 2, 0.1);
        plot.setPointSize(1);
        for (double angle = 0; angle <= 4 * Math.PI; angle += 0.00004 * Math.PI) {
            plot.addPoint(angle, wave1(angle));
        }
    }
}