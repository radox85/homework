package pl.radox.homework1;

public class ReversStringRecursion {

    public static void main(String[] args) {
        String stringToReverse = "Radek";
        System.out.println(reverseStr(stringToReverse));
    }

    private static String reverseStr(String str) {
        if ((str == null) || (str.length() <= 1))
            return str;
        return reverseStr(str.substring(1)) + str.charAt(0);
    }
}


