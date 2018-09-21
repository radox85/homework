package pl.radox.loops;


import java.util.Random;

class Petle {
    private final static int SIZEOFTAB = 10;

    //Zadanie 1
    static void ex1() {
        int[] tab = new int[SIZEOFTAB];
        Random random = new Random();
//////////////a i b
        for (int i = 0; i < SIZEOFTAB; i++) {
            tab[i] = random.nextInt(100);  // bound E <0,100)
            System.out.print(tab[i] + "|");
        }

//////////////c
        System.out.println();
        int stop = 0;
        while (stop < SIZEOFTAB) {
            System.out.print(tab[stop] + "|");
            stop++;
        }

//////////////d
        System.out.println();
        long suma = 0;
        for (int i = 0; i < SIZEOFTAB; i++) {
            suma += tab[i];
        }
        System.out.println("Sum of tab rows: " + suma);

//////////////e
        long product = 1;
        stop = 0;
        while (stop < SIZEOFTAB) {
            if (tab[stop] != 0) {
                product *= tab[stop];
                stop++;
            }
            stop++;
        }
        System.out.println("Product of elements in tab: " + product);
//////////////f
        stop = 0;
        System.out.println("Odd numbers in tab: ");
        do {
            if (tab[stop] % 2 == 1) {
                System.out.print(tab[stop] + " ");
            }
            stop++;

        } while (stop < SIZEOFTAB);
//////////////g
        System.out.println("\nEven numbers in tab: ");
        for (int number : tab) {
            if (number == 0 || number % 2 == 0)
                System.out.print(number + " ");
        }


    }


    static void ex2() {
////////a
        int[][] tab = new int[SIZEOFTAB][SIZEOFTAB];
        Random random = new Random();
        for (int i = 0; i < SIZEOFTAB; i++) {
            for (int j = 0; j < SIZEOFTAB; j++) {
                tab[i][j] = random.nextInt(100);
            }
        }
////////b
        for (int[] row : tab) {
            for (int el : row) {
                System.out.printf("%-2d|", el);
            }
            System.out.println();
        }
////////c
        int max = Integer.MIN_VALUE;
        int rows = SIZEOFTAB - 1;
        int col = SIZEOFTAB - 1;
        while (col >= 0) {
            while (rows >= 0) {
                if (tab[col][rows] > max) {
                    max = tab[col][rows];
                }
                rows--;
            }
            rows = SIZEOFTAB - 1;
            col--;
        }
        System.out.println("\nHighest element in array: " + max);
////////d
        int sum = 0;
        for (int i = 0; i < SIZEOFTAB; i++) {
            for (int j = 0; j < SIZEOFTAB; j++) {
                sum += tab[i][j];
            }
            System.out.printf("Sum in row %d: %d\n", i + 1, sum);
            sum = 0;
        }
////////e
        rows = SIZEOFTAB - 1;
        col = SIZEOFTAB - 1;
        int min = Integer.MAX_VALUE;
        do {
            do {
                if (tab[col][rows] < min) {
                    min = tab[col][rows];
                }
                rows--;
            } while (rows >= 0);
            System.out.printf("Minimal elenemt in row : %d\n", min);
            rows = SIZEOFTAB - 1;
            min = Integer.MAX_VALUE;
            col--;
        } while (col >= 0);

////////f
        sum = 0;
        for (int i = 0; i < SIZEOFTAB; i++) {
            for (int j = 0; j < SIZEOFTAB; j++) {
                sum += tab[j][i];
            }
            System.out.println("Sum of element in column: " + sum);
            sum = 0;

        }
    }


}