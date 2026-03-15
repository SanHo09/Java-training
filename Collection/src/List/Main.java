package List;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<String> products = new ArrayList<>();

        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Mouse");

        System.out.println(products);

        for (String product : products) {
            System.out.println(product);
        }

    }
}