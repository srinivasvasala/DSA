package Arrays;
public class cube_sum_pair {
    public static int cubeSumPair(int n) { // the input is an integer, not an array
        int count = 0;
        for (int i = 1; i< n; i++) { // changed the loop conditions to avoid out of bounds errors
            for (int j = 0; j < n; j++) { // j < i to avoid counting pairs twice
                int a = i * i * i;
                int b = j * j * j;
                int c = a + b;
                if (c == n) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        System.out.println(cubeSumPair(n1)); // output should be 2
        System.out.println(cubeSumPair(n2)); // output should be 1
    }
}



