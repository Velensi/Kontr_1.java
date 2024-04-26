import java.util.Scanner;

public class Ex_2 {
    public static int rec_sum(int a, int b) {
        if (a == 0) {
            return b;
        } else return rec_sum(a - 1, b + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа:");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();


        System.out.println("sum = " + rec_sum(a, b));
    }
}