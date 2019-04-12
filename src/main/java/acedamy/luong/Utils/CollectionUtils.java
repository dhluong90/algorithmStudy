package acedamy.luong.Utils;

import java.util.List;

public class CollectionUtils {

    public static int[] arrayIntOf(int ... elements) {
        return elements;
    }
    public static int[] arrayIntOf(List<Integer> list) {
        int[] results = new int[list.size()];
        for(int i = 0; i < results.length; i++) {
            results[i]= list.get(i);
        }
        return results;
    }
}
