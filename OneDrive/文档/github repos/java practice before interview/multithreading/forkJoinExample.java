import java.util.concurrent.*;

class SumTask extends RecursiveTask<Long> {
    private final int[] arr;
    private final int start, end;
    private static final int THRESHOLD = 3;

    SumTask(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if ((end - start) <= THRESHOLD) {
            long sum = 0;
            for (int i = start; i < end; i++) sum += arr[i];
            return sum;
        } else {
            int mid = (start + end) / 2;
            SumTask left = new SumTask(arr, start, mid);
            SumTask right = new SumTask(arr, mid, end);

            left.fork();              // async execution
            long rightResult = right.compute(); // direct compute
            long leftResult = left.join();      // wait for left

            return leftResult + rightResult;
        }
    }
}

public class forkJoinExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        ForkJoinPool pool = new ForkJoinPool();
        long result = pool.invoke(new SumTask(arr, 0, arr.length));
        System.out.println("Sum: " + result);
    }
}
