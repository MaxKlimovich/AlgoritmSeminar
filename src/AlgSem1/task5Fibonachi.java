package AlgSem1;

import java.util.Date;

public class task5Fibonachi {
    public static void main(String[] args) {
        System.out.println(linealFindFibonachi(8));
        test();
    }
    public static void test() {
        for (int i = 10; i <= 50; i = i + 10) {
            Date starDate = new Date();
            linealFindFibonachi (i);
            Date endDate = new Date();
            long lineDuration = endDate.getTime() - starDate.getTime();
            starDate = new Date();
            findFibonachi(i);
            endDate = new Date();
            long recursiveDuration = endDate.getTime() - starDate.getTime();
            System.out.printf("i: %s, line duration: %s, recursive duration: %s%n", i, lineDuration, recursiveDuration);

        }
    }
    public static int findFibonachi (int n) {
        if(n <= 2){
            return 1;
        }
        return findFibonachi(n - 1) + findFibonachi(n - 2);
    }
    public static int linealFindFibonachi (int n) {
        int result = 0;
        int previous = 1;
        int prePrevious = 1;
        for (int i = 2; i < n; i++) {
            result = previous + prePrevious;
            prePrevious = previous;
            previous = result;
        }
        return  previous;
    }
}
