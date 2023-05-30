package AlgSem1;

public class task4RandomEdge {
    public static void main(String[] args) {
        System.out.print(combinationCount(3, 2));
    }
    public static int combinationCount(int count, int faces) {
        if (count > 0) {
            return recursiveCounter(1, count, faces);
        } else {
            return 0;
        }
    }
// depth = 1 maxDepth = 3 faces = 2
    private static int recursiveCounter(int depth, int maxDepth, int faces) {
        int count = 0;
        for (int i = 1; i <= faces; i++) {
            if (depth == maxDepth) {
                count++;
            } else {
                count += recursiveCounter(depth + 1, maxDepth, faces);
            }
        }
        return count;
    }
}
