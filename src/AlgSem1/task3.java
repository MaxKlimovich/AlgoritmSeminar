package AlgSem1;
public class task3 {
    public static void main(String[] args) {
        System.out.print(EdgeCounter(3));
    }
    public static int EdgeCounter (int edges) {
        int count = 0;
        for (int i = 1; i <= edges; i++) {
            for (int j = 1; j <= edges; j++) {
                for (int k = 1; k <= edges; k++) {
                    for (int l = 1; l <= edges; l++) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

