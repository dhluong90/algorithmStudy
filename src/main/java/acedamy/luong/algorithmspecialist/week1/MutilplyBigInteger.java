package acedamy.luong.algorithmspecialist.week1;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MutilplyBigInteger {

    public final static void main(String arg[]) {
        BigDecimal a = new BigDecimal("3141592653589793238462643383279502884197169399375105820974944592");
        BigDecimal b = new BigDecimal("2718281828459045235360287471352662497757247093699959574966967627");
        System.out.println(a.multiply(b).toString());
    }

    static String multiplyValue(String param1, String param2) {
        int i = param2.length() -1;
        List<List<Integer>> values = new LinkedList<>();
        int maxSizeOftempValue = 0;
        while (i >= 0) {
            LinkedList<Integer> arrayTempValue = new LinkedList<>();
            for (int k = 0; k <= (param2.length() - i - 1); k++) {
                arrayTempValue.add(0);
            }
            values.add(arrayTempValue);
            Integer currentValue = (int) param2.charAt(i);
            int j = param1.length() -1;
            int rememberValue = 0;
            while(j >=0) {
                Integer value = currentValue * param1.charAt(j) + rememberValue;
                rememberValue = value / 10;
                arrayTempValue.add(value%10);
                j--;
            }
            if (rememberValue != 0) {
                arrayTempValue.add(rememberValue);
            }
            if (maxSizeOftempValue < arrayTempValue.size()) {
                maxSizeOftempValue = arrayTempValue.size();
            }
            i--;
        }
        List<Integer> result  = new LinkedList<>();
        int g = 0;
        BiFunction< Integer, List<Integer>, Integer> getValue = (index, vals) -> index >= vals.size() ? 0 : vals.get(index);
        while(true) {
            int sum = 0;
            int odd = 0;
            for(List<Integer> list : values) {
                sum += getValue.apply(g, list);
            }
       //     String.valueOf(sum)
        }

      //  return null;
    }


}
