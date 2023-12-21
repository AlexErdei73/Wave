public class Wave {
    public static void main(String[] args) {
        Plot plot = new Plot("Sin Function", 0, 4 * Math.PI, Math.PI / 18, -2, 2, 0.1);
        for (double angle = 0; angle <= 4 * Math.PI; angle += 0.004 * Math.PI) {
            plot.addPoint(angle, Math.sin(angle));
        }
    }
}