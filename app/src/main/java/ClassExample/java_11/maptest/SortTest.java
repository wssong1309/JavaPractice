package ClassExample.java_11.maptest;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class SortTest {
    public static void main(String[] args) {
        String[] fruits = {"포도", "수박", "사과", "키위", "망고"};
        
        List<String> list = Arrays.asList(fruits);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);

    }
}
