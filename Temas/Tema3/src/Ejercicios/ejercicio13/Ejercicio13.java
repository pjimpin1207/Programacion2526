package Ejercicios.ejercicio13;

public class Ejercicio13 {
    public static void main(String[] args) {

        // 1.
        boolean exp1 = 10 + 5 * 2 > 20 && 4 == 4;
        System.out.println("1) 10 + 5 * 2 > 20 && 4 == 4 → " + exp1);

        // 2.
        boolean exp2 = (!(7 + 3 > 10)) || 3 * 2 <= 6;
        System.out.println("2) (!(7 + 3 > 10)) || 3 * 2 <= 6 → " + exp2);

        // 3.
        boolean exp3 = 10 / 2 + 3 * 5 == 19 && true;
        System.out.println("3) 10 / 2 + 3 * 5 == 19 && true → " + exp3);

        // 4.
        int x = 5;
        x += 3 * 2;
        System.out.println("4) x += 3 * 2 → x = " + x);

        // 5.
        boolean b = false;
        b = !b || 7 % 2 == 1;
        System.out.println("5) b = !b || 7 % 2 == 1 → b = " + b);
    }
}
