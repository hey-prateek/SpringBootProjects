import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class code14_threadPoolExecutor {
    public static void main(String[] args) {
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(
                2, // corePoolSize
                4, // maximumPoolSize
                5, // keepAliveTime
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2), // queue of 2 tasks
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy() // rejection handler
        );

        for (int i = 1; i <= 5; i++) {
            int flag = i;
            tpe.execute(() -> {
                System.out.println("Task " + flag + " executed by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            });
        }

        while (!tpe.isTerminated()) {
            System.out.println("Active Threads: " + tpe.getActiveCount() +
                    ", Completed Tasks: " + tpe.getCompletedTaskCount() +
                    ", Queue Size: " + tpe.getQueue().size());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            if (tpe.getCompletedTaskCount() == 5)
                tpe.shutdown();
        }
    }

}
