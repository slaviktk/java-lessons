/**
 * Created by User on 19.05.2018.
 */
public class lesson2 {
    public static void main (String [] args) {
        int x = 2, y = 3;
        System.out.println(Math.pow(x, y));
        System.out.println(Math.sqrt(121));

        int n = 123, base = 10;
        int a = n % base;
        n /= base;
        int b = n % base;
        n /= base;
        int c = n % base;
        n /= base;
        int d = n % base;
        n /= base;
        int e = n % base;
        System.out.println("a=" + a);
    }
}

