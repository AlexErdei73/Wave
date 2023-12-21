import java.awt.*;

public class Wave {
    static double wave1(double x, int kmax) {
        double sum = 0;
        for (int k = 1; k <= kmax; k += 2) {
            sum += Math.sin(k*x) / k;
        }
        return sum;
    }
    static double wave2(double x, int kmax) {
        double sum = 0;
        for (int k = 1; k <= kmax; k++) {
            sum += Math.sin(k*x) / k;
        }
        return sum;
    }
    static double wave3(double x, int kmax) {
        double sum = 0;
        for (int k = 1; k <= kmax; k += 2) {
            if ((k - 1)/2 % 2 == 0) {
                sum += Math.sin(k*x) / (k*k);
            } else {
                sum -= Math.sin(k*x) / (k*k);
            }
        }
        return sum;
    }
    static double wave4(double x, int kmax) {
        double sum = 0;
        for (int k = 1; k <= kmax; k += 2) {
                sum += Math.sin(k*x) / (k*k);
        }
        return sum;
    }


    public static void main(String[] args) {
        int kmax = 100;
        try {
            kmax = Integer.parseInt(args[0]);
    } catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("No integer parameter, we use kmax = " + kmax);
        }
        Plot plot = new Plot("Sin Function", 0, 4 * Math.PI, Math.PI / 18, -2, 2, 0.1);
        plot.setPointSize(1);
        for (double angle = 0; angle <= 4 * Math.PI; angle += 0.0004 * Math.PI) {
            plot.setColor(Color.black);
            plot.addPoint(angle, wave1(angle, kmax));

            plot.setColor(Color.red);
            plot.addPoint(angle, wave2(angle, kmax));

            plot.setColor(Color.green);
            plot.addPoint(angle, wave3(angle, kmax));

            plot.setColor(Color.blue);
            plot.addPoint(angle, wave4(angle, kmax));
        }

    }
}