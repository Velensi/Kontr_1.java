import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = -1, sum = 0;
        while (a != 0){
            a = sc.nextInt();
            if (a == 0) break;
            else sum = sum + a;
        }
        System.out.println(sum);

    }
}
