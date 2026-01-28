public class RecursionTest {
     static int factorial(int k) {
         if (k > 1) {
             return (k * factorial(k - 1));
         } else {
             return k;
         }
    }

    public static void main(String[] args) {
        int num = factorial(5);
        System.out.println(num);
    }
}
