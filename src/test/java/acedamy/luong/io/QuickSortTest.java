package acedamy.luong.io;

import acedamy.luong.Utils.CollectionUtils;
import acedamy.luong.Utils.IOUtils;
import acedamy.luong.algorithmspecialist.week1.QuickSortAlgorithm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class QuickSortTest {


    @Test
    public void test_partition_array() {
        int[] arrays = CollectionUtils.arrayIntOf(3, 1, 5, 7, 2);
        int pivotIndex = QuickSortAlgorithm.partition(arrays, 4, 0, 4);
        Assert.assertArrayEquals(CollectionUtils.arrayIntOf(2,1,3,7,5), arrays);


        arrays = CollectionUtils.arrayIntOf(3, 1, 5, 7, 2);
        pivotIndex = QuickSortAlgorithm.partition(arrays, 3, 0, 4);
        Assert.assertArrayEquals(CollectionUtils.arrayIntOf(2,1,3,7,5), arrays);

        arrays = CollectionUtils.arrayIntOf(3, 6, 5, 7, 8);
        pivotIndex = QuickSortAlgorithm.partition(arrays, 3, 0, 4);
        Assert.assertArrayEquals(CollectionUtils.arrayIntOf(3,6,5,7,8), arrays);

        arrays = CollectionUtils.arrayIntOf(3, 1, 5, 7, 3);
        pivotIndex = QuickSortAlgorithm.partition(arrays, 3, 0, 4);
        Assert.assertArrayEquals(CollectionUtils.arrayIntOf(3,1,3,7,5), arrays);

        //Assert.assertEquals(2, pivotIndex);
        arrays = CollectionUtils.arrayIntOf(1);
        pivotIndex = QuickSortAlgorithm.partition(arrays, 4, 0, 0);
        Assert.assertArrayEquals(CollectionUtils.arrayIntOf(1), arrays);
       // Assert.assertEquals(0, pivotIndex);
        arrays = CollectionUtils.arrayIntOf(4,3);
        pivotIndex = QuickSortAlgorithm.partition(arrays, 3, 0, 1);
        Assert.assertArrayEquals(CollectionUtils.arrayIntOf(3,4), arrays);
        //Assert.assertEquals(0, pivotIndex);
    }

    @Test
    public void test_quickSort() {
        int[] arrays = CollectionUtils.arrayIntOf(3, 1, 5, 7, 2);
        System.out.println(QuickSortAlgorithm.quickSort(arrays, 0, 4));
        Assert.assertArrayEquals(CollectionUtils.arrayIntOf(1,2,3,5,7), arrays);

        arrays = CollectionUtils.arrayIntOf(3, 1, 5, 7, 3);
        System.out.println(QuickSortAlgorithm.quickSort(arrays, 0, 4));
        Assert.assertArrayEquals(CollectionUtils.arrayIntOf(1,3,3,5,7), arrays);

//        arrays = CollectionUtils.arrayIntOf(1);
//        QuickSortAlgorithm.quickSort(arrays, 0, 0);
//        Assert.assertArrayEquals(CollectionUtils.arrayIntOf(1), arrays);
//        arrays = CollectionUtils.arrayIntOf(4,3);
//        QuickSortAlgorithm.quickSort(arrays, 0, 1);
//        Assert.assertArrayEquals(CollectionUtils.arrayIntOf(3,4), arrays);
    }
}
