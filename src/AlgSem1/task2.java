package AlgSem1;

import java.util.ArrayList;
import java.util.List;

// Написать алгоритп по поиску простых чисел от 1 до n
public class task2 {
    public static void main(String[] args) {
        System.out.print(findSympleNumbers(100));
    }
    public static List<Integer> findSympleNumbers(int n)
    {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < n; i++)
        {
            boolean isSymple = true;
            for (int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    isSymple = false;
                    break;
                }
            }
            if(isSymple)
            {
                result.add(i);
            }
        }
        return result;
    }
}
