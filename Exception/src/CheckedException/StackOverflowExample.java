package CheckedException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class StackOverflowExample {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader("data.txt");
    }
}
