package Error;

public class StackOverflowExample {
    public static int recursiveMethod(int i) {
        System.out.println(i);

        return recursiveMethod(i + 1);
    }

    public static void main(String[] args) throws StackOverflowError {
        int a[] = {1, 2, 3,};
        System.out.println(a[100]);
    }
}
