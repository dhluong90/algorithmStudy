package acedamy.luong.Utils;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class IOUtils {

    public static List<Integer> readInputToArrays(String fileName) throws FileNotFoundException {
        FileReader fileReader = new FileReader(new File(fileName));
        List<Integer> arrays = new LinkedList<>();
        String line = null;
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            line = bufferedReader.readLine();
            while(line != null) {
                arrays.add(Integer.valueOf(line));
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrays;
    }
}
