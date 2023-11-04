public class Methods {
    public static void main(String[] args) {

        welcome();
        multiply(5, 100);
        multiply(2, 3);
        multiply(6, 8);
        divide(20,5);
        divide(100,10);
        divide(66,11);
    }



    private static void welcome() {
        System.out.println("Welcome to our calculator!");
    }
    private static void multiply(int a, int b) {
        System.out.println(a * b);
    }
    private static void divide(int a, int b) {
        System.out.println(a / b);
    }
}
