public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        var output = add(3, 4);
        System.out.println("Addition : " + output);
    }
}
