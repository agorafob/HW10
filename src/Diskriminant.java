import java.util.Scanner;

public class Diskriminant {

    public static void main(String[] args) {
        System.out.println("Решение квадратных уравнений ax^2 + bx + c = 0");
        System.out.println("Впишите значение a, b и c:\n");
        Scanner userdata = new Scanner(System.in);
        solution(userdata.nextDouble(), userdata.nextDouble(), userdata.nextDouble());
    }

    private static double disc(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    public static void solution(double a, double b, double c) {
        double d = disc(a, b, c);
        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = ((-b) - Math.sqrt(d)) / (2 * a);
            System.out.println("Корень x1=" + x1 + " Корень x2=" + x2);
        } else if (d == 0) {
            double x = -b / 2 * a;
            System.out.println("Корень x=" + x);
        } else {
            System.out.println("Уравнение не имеет корней");
        }
    }
}
