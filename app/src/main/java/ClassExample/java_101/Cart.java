package ClassExample.java_101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cart<T> { // 여기서 T : Type Parameter
    private List<T> items;

    // [1] Collection에서 Generics사용
    public Cart() {
        items = new ArrayList<>();
    }

    // [2] parameter type으로 Generics사용
    public Cart(T[] arr) {
        items = new ArrayList<>(Arrays.asList(arr));
    }

    // [3] method의 parameter type으로 Generics 사용
    public void add(T item) {
        items.add(item);
    }

    // [4] method의 return type으로 Generics 사용
    public T get(int index) {
        return items.get(index);
    }

    public void printAllItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}