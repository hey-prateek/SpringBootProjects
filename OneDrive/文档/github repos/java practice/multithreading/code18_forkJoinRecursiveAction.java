import java.util.concurrent.*;

class PrintTask extends RecursiveAction {
    private int start, end;

    public PrintTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if ((end - start) <= 3) {
            for (int i = start; i <= end; i++)
                System.out.println(Thread.currentThread().getName() + " prints " + i);
        } else {
            int mid = (start + end) / 2;
            PrintTask left = new PrintTask(start, mid);
            PrintTask right = new PrintTask(mid + 1, end);
            invokeAll(left, right); // run both in parallel
        }
    }
}

public class code18_forkJoinRecursiveAction {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new PrintTask(1, 10));
        pool.shutdown();
    }
}
