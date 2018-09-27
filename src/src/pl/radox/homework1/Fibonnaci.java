package pl.radox.homework1;

public class Fibonnaci {

    static long findFibbonaci(int x) {

        if (x == 1)
            return 1;
        if (x == 0)
            return 0;


        return findFibbonaci(x-2) + findFibbonaci(x-1);
    }

    public static void main(String[] args) {
        System.out.println(Fibonnaci.findFibbonaci(11));
    }
}
