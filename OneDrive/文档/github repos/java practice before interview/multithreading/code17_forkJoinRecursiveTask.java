import java.util.concurrent.*;

class SumTask extends RecursiveTask<Integer> {
    private int start, end;

    public SumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int threshold = 5; // smaller range handled directly
        if ((end - start) <= threshold) {
            int sum = 0;
            for (int i = start; i <= end; i++)
                sum += i;
            return sum;
        } else {
            int mid = (start + end) / 2;
            SumTask left = new SumTask(start, mid);
            SumTask right = new SumTask(mid + 1, end);
            left.fork(); // run left asynchronously
            int rightResult = right.compute(); // compute right
            int leftResult = left.join(); // wait for left result
            return leftResult + rightResult;
        }
    }
}

public class code17_forkJoinRecursiveTask {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(1, 20);
        int result = pool.invoke(task);
        System.out.println("Sum from 1 to 20 = " + result);
    }
}
