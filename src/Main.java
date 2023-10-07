import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Параметры первого круга:");
        System.out.println("Введите X: ");
        int x1 = Scan.nextInt();
        System.out.println("Введите Y: ");
        int y1 = Scan.nextInt();
        System.out.println("Введите R: ");
        int r1 = Scan.nextInt();
        System.out.println("Параметры второго круга:");
        System.out.println("Введите X: ");
        int x2 = Scan.nextInt();
        System.out.println("Введите Y: ");
        int y2 = Scan.nextInt();
        System.out.println("Введите R: ");
        int r2 = Scan.nextInt();
        System.out.println("Первый круг:");
        Circle circle1 = new Circle(x1, y1, r1);
        double S = circle1.square(r1);
        double L = circle1.length(r1);
        circle1.info(x1, y1, r1, S, L);
        System.out.println("Второй круг:");
        Circle circle2 = new Circle(x2, y2, r2);
        double S2 = circle2.square(r2);
        double L2 = circle2.length(r2);
        circle2.info(x2, y2, r2, S2, L2);
        circle1.crossing(x1, y1, r1, x2, y2, r2);
    }
}