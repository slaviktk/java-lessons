/**
 * Created by User on 19.05.2018.
 */
public class lesson5 {
    public static void main (String [] args) {                 /* Primer 4*/
    System.out.println(S(1,2));
        System.out.println( S(7,8));
        System.out.println(S(9,10));
        System.out.println (stepen(5));
        System.out.println (sin2(45));
        System.out.println (triC(3,4,90));
        System.out.println (triC(12,5,90));
        System.out.println (triC(15,16,180));
    }
        public static int summa2 (int a, int b) {
        int c = a + b;
            return c;
    }
    public static double perimetr (double a, double b) {
            return 2 * (a + b);
    }
    public static double f (double x) {
            double y = x*x - 1;
            return y;
    }
    public static double S (double a, double b){       /* Primer 1*/
        double s = a*b;
        return s;
    }
    public static double stepen (double x){            /* Primer 2*/
        double y = Math.pow(x,3) + Math.pow(x,2) + 1;
        return y;
    }
    public static double sin2 (double x){             /* Primer 3*/
        double y = Math.sin(Math.toRadians(x*2));
        return y;
    }
    public static double triC(double a, double b, double angle){
        double c = Math.pow(a,2) + Math.pow(b,2) - 2*b*a*Math.cos(Math.toRadians(angle));            /*a2 = b2 + c2 – 2bc cosα */
        return Math.sqrt(c);
    }
}

