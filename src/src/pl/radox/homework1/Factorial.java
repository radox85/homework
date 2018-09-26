package pl.radox.homework1;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Factorial.factorial(4));

    }

     static int factorial(int result) {
        if (result < 2) {
            return 1;
        }
        return result * factorial(result - 1);
    }

}
