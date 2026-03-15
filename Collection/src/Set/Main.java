package Set;

import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Set<String> tags = new HashSet<>();

        tags.add("Java");
        tags.add("Backend");
        tags.add("Java");
        tags.add("Spring");

        System.out.println(tags);
    }
}