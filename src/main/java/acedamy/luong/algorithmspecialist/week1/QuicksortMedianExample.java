package acedamy.luong.algorithmspecialist.week1;

import acedamy.luong.Utils.CollectionUtils;
import acedamy.luong.Utils.IOUtils;

import java.io.FileNotFoundException;
import java.util.List;

public class QuicksortMedianExample {
 
    private static int []a;
    public static void main(String[] args) throws FileNotFoundException {
        // Get a random generated array
        a = getArray();
         
        // prints the given array

        // sort the array
        sort();
    }
     
    // This method sorts an array and internally calls quickSort 
    public static void sort(){
        int left = 0;
        int right = a.length-1;
        System.out.println("Start Sorting...");
        int comparation = quickSort(left, right);
        System.out.println("End Sorting....");
        System.out.println(comparation);
    }
     
    // This method is used to sort the array using quicksort algorithm.
    // It takes left and the right end of the array as two cursors
    private static int quickSort(int left,int right){
         
        // If both cursor scanned the complete array, quicksort exits
        if(left >= right)
            return 0;
         
        // Pivot using median of 3 approach
        int pivot = getMedian(left, right);
        int partition = partition(left, right, pivot);
        int comparation = right - left;
        // Recursively, calls the quicksort with the different left and right parameters of the sub-array
        comparation += quickSort(0, partition-1);
        comparation += quickSort(partition+1, right);
        return  comparation;
    }
     
    // This method is used to partition the given array and returns the integer which points to the sorted pivot index
    private static int partition(int left,int right,int pivot){
        int leftCursor = left-1;
        int rightCursor = right;
        while(leftCursor < rightCursor){
        while(a[++leftCursor] < pivot);
            while(rightCursor > 0 && a[--rightCursor] > pivot);
            if(leftCursor >= rightCursor){
                break;
            }else{
                swap(leftCursor, rightCursor);
            }
        }
        swap(leftCursor, right);
        return leftCursor;
    }
     
    public static int getMedian(int left,int right){
        int center = (left+right)/2;
         
        if(a[left] > a[center])
            swap(left,center);
         
        if(a[left] > a[right])
            swap(left, right);
         
        if(a[center] > a[right])
            swap(center, right);
         
        swap(center, right);
        return a[right];
    }
     
    // This method is used to swap the values between the two given index
    public static void swap(int left,int right){
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }
     
    public static void printArray(){
        for(int i : a){
            System.out.print(i+" ");
        }
    }
     
    public static int[] getArray() throws FileNotFoundException {
        List<Integer> arrays = IOUtils.readInputToArrays("src/main/resources/quickSortSample.txt");
        return CollectionUtils.arrayIntOf(arrays);
    }
 
}