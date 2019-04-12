package acedamy.luong.algorithmspecialist.week1;

import acedamy.luong.Utils.CollectionUtils;
import acedamy.luong.Utils.IOUtils;
import org.junit.Assert;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class QuickSortAlgorithm {

    public static void main(String[] strings) throws FileNotFoundException {
        List<Integer> arrays = IOUtils.readInputToArrays("src/main/resources/quickSortSample.txt");
        int[] arr = CollectionUtils.arrayIntOf(arrays);
        int[] sorted = CollectionUtils.arrayIntOf(arrays);
        Arrays.sort(sorted);
        int comparation = quickSort(arr , 0, arrays.size() -1);
        System.out.println(comparation);
        Assert.assertArrayEquals(sorted, arr);

    }

    public static int quickSort(int[] arrays, int start, int end) {
        if (end - start <= 0) return 0;
        int pivot = arrays[start];
        int pivotIndex = partition(arrays, pivot, start, end);
        int comparation = end - start;
        comparation += quickSort(arrays, start, pivotIndex - 1);
        comparation += quickSort(arrays, pivotIndex + 1, end);
        return comparation;
    }

    public static int partition(int[] arrays, int pivot, int start, int end) {
        int i = start,j = start + 1;
        while(i <= end && j <= end) {
            if (arrays[j] < pivot) {
                i++;
                swap(arrays, i, j);
            }
            j++;
        }
        swap(arrays, i, start);
        return i;
    }

    public static void swap(int[] arrays, int a, int b) {
        int temp = arrays[a];
        arrays[a] = arrays[b];
        arrays[b] = temp;
    }
}
