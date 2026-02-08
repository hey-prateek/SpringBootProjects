import java.io.*;

public class B_digitSum {

    static int digitSum(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long N = Long.parseLong(input[0]);
        int K = Integer.parseInt(input[1]);

        int count = 0;
        for (long i = 1; i <= N; i++) {
            if (digitSum(i) == K) {
                count++;
            }
        }

        System.out.println(count);
    }
}
