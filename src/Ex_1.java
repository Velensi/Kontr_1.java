import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координат x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Введите координат y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Введите координат x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Введите координат y2: ");
        double y2 = scanner.nextDouble();

        System.out.println("Расстояние между точкой (" + x1 + ", " + y1 + ") и точкой (" + x2 + ", " + y2 + ") равно " + distance(x1, y1, x2, y2));
    }
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

}
