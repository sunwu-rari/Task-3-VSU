import java.util.Scanner;

public class Main {

    public static final Line L1 = new Line(-3, 10, -2);
    public static final Line L2 = new Line(1, 10, 3);
    public static final Parabola P =
            new Parabola(1, -2, 1);
    public static final Circle C =
            new Circle(-1, 4, 3);

    public static Color getColor(double x, double y) {

        if (C.contains(x, y)) {
            return Color.BLUE;
        }

        if (!P.isPointAbove(x, y)) {
            return Color.GRAY;
        }

        if (!L1.isPointAbove(x, y)) {
            return Color.ORANGE;
        }

        if (L2.isPointAbove(x, y)) {
            return Color.GREEN;
        }

        if (y > 5) {
            return Color.YELLOW;
        }

        return Color.WHITE;
    }

    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.2f, %.2f) -> %s%n", x, y, getColor(x, y));
    }

    public static void main(String[] args) {

        printColorForPoint(-8, 0);
        printColorForPoint(6, 0);
        printColorForPoint(0, 0);
        printColorForPoint(-1, 4);
        printColorForPoint(1, -3);

        Scanner sc = new Scanner(System.in);
        System.out.print("Input X: ");
        double x = sc.nextDouble();
        System.out.print("Input Y: ");
        double y = sc.nextDouble();

        printColorForPoint(x, y);
    }
}
