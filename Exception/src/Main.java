//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            int a = 2/0;
        } catch (Exception ex){
            System.out.println(ex);
            System.out.println("Math error");

        }
    }
}