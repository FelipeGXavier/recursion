public class App {

    public static void head(int n) {
        if (n == 0)
            return;
        else
            head(n - 1);
        System.out.println(n);
    }

    public static void tail(int n) {
        if (n == 0)
            return;
        else
            System.out.println(n);
        tail(n - 1);
    }

    public static int headFactorial(int n) {
        if (n == 1) return 1;
        return n * headFactorial(n - 1);
    }

    /**
     * Far more optimized than head recursion implementation, result act as accumulator
     * tailFactorial(5,1)
     * tailFactorial(4,5)
     * tailFactorial(3,20)
     * tailFactorial(2,60)
     * tailFactorial(1,120)
     * */
    public static int tailFactorial(int n, int result) {
        if(n == 1) {
            return result;
        }
        return tailFactorial(n - 1, n * result);
    }

    public static int sumRecursive1(int n) {
        if (n == 1) return 1;
        return n + sumRecursive1(n - 1);
    }

    public static int sumRecursive2(int n, int acc) {
        if (n == 0){
            return acc;
        }
        return sumRecursive2(n - 1, acc + n);
    }

    public static void main(String[] args) {
        head(5);
        tail(5);
        System.out.println(tailFactorial(5, 1));
        System.out.println(sumRecursive2(4, 0));
    }
}
