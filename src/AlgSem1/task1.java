package AlgSem1;


// Найти сумму от 1 до N
public class task1 {
    public static void main(String[] args) {
        System.out.print(findSumOfArray(3));
    }
    public static int findSumOfArray (int n)
    {
        int result = 0;
        for(int i = 1; i <= n; i++)result +=i;
        return result;
    }
}
