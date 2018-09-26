package pl.radox.homework1;

import java.util.Arrays;
import java.util.Optional;

public class ReturnXBiggestElementFromArray {
    public static void main(String[] args) {
        int[] tab = {25, 1, 2, 8, 7, 9, 6, 32, 4, 5, 9, 3, 1, 56, 88, 9};
        System.out.println(Arrays.toString(tab));
        System.out.println(findX(tab, 1));
        System.out.println(Arrays.toString(tab));
    }

public static int findX(int[] tab, int x){
        int[] temp=tab;
        sort(temp,0,temp.length-1);
        return temp[temp.length-x];
}

    public static void sort(int[] array, int p, int r) {
        if (p < r) {
            int m = (p + r) / 2;
            sort(array, p, m);
            sort(array, m+1, r);
            merge(array, p, m, r);
        }
    }

    private static void merge(int[] array, int p, int m, int r) {
        int[] B = new int[r - p + 1];
        int i = p, j = m + 1, k = 0;
        while (i <= m && j <= r) {
            if (array[i] <= array[j]) {
                B[k++] = array[i++];
            } else {
                B[k++] = array[j++];
            }
        }
        while (i <= m) {
            B[k++] = array[i++];
        }
        while (j <= r) {
            B[k++] = array[j++];
        }
        for (k = 0; k <= r-p; k++) {
            array[p+k] = B[k];
        }
    }
}
