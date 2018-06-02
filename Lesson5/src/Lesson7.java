import java.util.Scanner;

/**
 * Created by User on 02.06.2018.
 */
public class Lesson7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
           //1.
            System.out.println("Введите число А:");
            int a = sc.nextInt();
            System.out.println("Введите число B:");
            int b = sc.nextInt();
            System.out.println("A=" + a);
            System.out.println("B=" + b);

            if (a > b) {
                System.out.println(a);
            }
                else  {
                System.out.println(b);
            }
        }
    }
    public static int max (int a, int b, int c) {
        if (a >= b) {
            System.out.println(a);
        } else  {
            else return (b);
        }

    }

}
