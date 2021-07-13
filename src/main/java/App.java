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
        int res = headFactorial(n - 1);
        int result = n * res;
        return result;
    }


    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int fib1 = fib(n - 1);
        int fib2 = fib(n - 2);
        int result = fib1 + fib2;
        return result;
    }

    public static int fibTail(int n, int a, int b) {
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        return fibTail(n - 1, b, a + b);
    }

    public static int binarySearch(int[] arr, int n, int start, int end) {
        int middle = (start + end) / 2;
        if(start > end) return -1;
        if(arr[middle] == n) {
            return middle;
        }
        if(n > arr[middle]) {
            start = middle + 1;
        }else{
            end = middle - 1;
        }
        return binarySearch(arr, n, start, end);
    }

    public static int find(int[] arr, int n) {
        return go(arr, n, 0);
    }

    public static int go(int[] arr, int n, int start) {
        int arraySize = arr.length;
        if (arr[start] == n) {
            return start;
        }
        if (start == arraySize - 1) {
            return -1;
        }
        return go(arr, n, start + 1);
    }

    /**
     * Far more optimized than head recursion implementation, result act as accumulator
     * tailFactorial(5,1)
     * tailFactorial(4,5)
     * tailFactorial(3,20)
     * tailFactorial(2,60)
     * tailFactorial(1,120)
     */
    public static int tailFactorial(int n, int result) {
        if (n == 1) {
            return result;
        }
        return tailFactorial(n - 1, n * result);
    }

    public static int sumRecursive1(int n) {
        if (n == 1) return 1;
        return n + sumRecursive1(n - 1);
    }

    public static int sumRecursive2(int n, int acc) {
        if (n == 0) {
            return acc;
        }
        return sumRecursive2(n - 1, acc + n);
    }

}
