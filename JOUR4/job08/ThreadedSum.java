package JOUR4.job08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;

class SumTask implements Runnable {
    private long start;
    private long end;
    private long sum;

    public SumTask(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        sum = 0;
        for (long i = start; i <= end; i++) {
            sum += i;
        }
    }

    public long getSum() {
        return sum;
    }
}

public class ThreadedSum {
    public static void main(String[] args) {
        final long N = 10_000_000;
        final int THREAD_COUNT = 10;

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        List<Future<?>> futures = new ArrayList<>();
        List<SumTask> tasks = new ArrayList<>();

        long chunkSize = N / THREAD_COUNT;
        for (int i = 0; i < THREAD_COUNT; i++) {
            long start = i * chunkSize + 1;
            long end = (i == THREAD_COUNT - 1) ? N : (i + 1) * chunkSize;
            SumTask task = new SumTask(start, end);
            tasks.add(task);
            futures.add(executor.submit(task));
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
            // Attendre que tous les threads terminent
        }

        long totalSum = 0;
        for (SumTask task : tasks) {
            totalSum += task.getSum();
        }

        System.out.println("La somme totale est : " + totalSum);
    }
}

