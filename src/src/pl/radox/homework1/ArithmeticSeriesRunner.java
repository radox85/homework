package pl.radox.homework1;

public class ArithmeticSeriesRunner {

    public static void main(String[] args) {

        int[][] tabToCheck = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {2, 4, 2, 1, 3, 4, 4},
                {1, 1, 1, 1},
                {1, 2},
                {3, 6, 9}
        };


        for (int i = 0; i < tabToCheck.length; i++) {
            for (int j = 0; j < tabToCheck[i].length - 2; j++) {
                //mniej niz 3 nie jest ciagiem artm.
                if (tabToCheck[i].length < 2) {
                    continue;
                }
                if ((tabToCheck[i][j + 1] - tabToCheck[i][j]) == (tabToCheck[i][j + 2] - tabToCheck[i][j + 1])) {
                    System.out.println("Is arithmetic Series in row: " + i);
                    break;
                }
            }
        }


    }
}
