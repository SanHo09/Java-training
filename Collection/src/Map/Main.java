package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> products = new HashMap<>();

        products.put(1, "Laptop");
        products.put(2, "Mouse");
        products.put(3, "Keyboard");
        products.put(4, "Keyboard");

        System.out.println(products.get(1));

        products.forEach((key, value) ->
                System.out.println(key + " : " + value));
    }
}