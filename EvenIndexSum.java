package Arrays;

public class EvenIndexSum {
    public static int[] evenSumArray(int arr[], int n) {
        int ps[] = new int[n];
        ps[0] = arr[0];
        for (int i = 1; i <= n - 1; i++) {
            if (i % 2 == 0) {
                ps[i] = ps[i - 1] + arr[i];
            } else {
                ps[i] = ps[i - 1];
            }
        }
        return ps;
    }

    public static void main(String args[]) {
        int arr[] = {3, -2, 4, 6, -3, 5};
        int n = 6;
        int[] result = evenSumArray(arr, n);
        System.out.print(result[n-1]);
    }
}

