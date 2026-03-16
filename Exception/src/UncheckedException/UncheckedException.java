package UncheckedException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class UncheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        String name = null;
        System.out.println(name.length());
    }
}
