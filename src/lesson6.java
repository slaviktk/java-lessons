/**
 * Created by User on 26.05.2018.
 */
public class lesson6 {
    public static void main(String[] args){
        System.out.println(usdTohrn(100));
        System.out.println (S(5,8));
    }
        public static double usdTohrn (double usd) {
        return usd * 26;
        }
        public static double hrnTousd (double hrn) {
            return hrn / 26;
        }
        /*
        1.Написать функцию, которая будет считать площадь прямоугольного треугольника или прямоугольника в зависимости
        от стороны А (если четная, то треугольник, если нечетная то пряугольник). Функция принимает в себя два параметра А и Б (целочисленные).
         */
        public static double S (double a, double b) {
            double s = a * b;
            if (a % 2 == 0) {
                return s / 2;
            } else {
            return s;
            }
        }

        /*
        2.Написать функцию, которая выводит на экран в какой промежуток попадает число. Функция принимает один параметр
         А (ценый) и выводит на экран в какой промежуток чисел попадает А. Функция ничего не возвращает.
             Промежутки:
             (0,10)
             (10,100)
             (100, 1000)
        */
            public static double promezutok {
            double A;
                if
            }
}