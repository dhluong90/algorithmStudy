package acedamy.luong.algorithmspecialist.week1;


import acedamy.luong.Utils.CollectionUtils;
import acedamy.luong.Utils.IOUtils;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CountingInversion {


    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> arrays = IOUtils.readInputToArrays("src/main/resources/IntegerArray.txt");
        System.out.println(countInversionI(CollectionUtils.arrayIntOf(arrays)));
    }

    public static long countInversionI(int[] arrays) {
        return countInversionI(arrays, 0, arrays.length -1);
    }

    private static long countInversionI(int[] arrays , int start, int end) {
        int n = end - start + 1;
        if (n <= 1) return 0;
        long countLeftHalf = countInversionI(arrays,  start, n/2 - 1 + start);
        long countRightHalf = countInversionI(arrays, n/2 + start, end);
        long countSplit = countSplit(arrays, start, end);
        return countLeftHalf + countRightHalf + countSplit;
    }

    /**
     *
     * @param arrays
     * @param start index of start
     * @param end index of end
     * @return count
     */
    private static long countSplit(int[] arrays , int start, int end) {
        int n = end - start + 1;
        int mid = n/2 -1 +start;
        int i,j,k;
        k = 0;
        i = start;
        j = mid + 1;
        long countIV = 0l;
        int[] temp = new int[n];
        while (i <= mid && j <= end) {
            if ((arrays[i] <= arrays[j]) ) {
                temp[k++] = arrays[i++];
            } else {
                temp[k++] = arrays[j++];
                countIV+= mid + 1 - i;
            }
        }
        while (i <= mid) temp[k++] = arrays[i++];
        while (j <= end) temp[k++] = arrays[j++];
        k=0;
        for (i = start; i <= end; i++) {
            arrays[i] = temp[k++];
        }
        return countIV;
    }

    ;
}
