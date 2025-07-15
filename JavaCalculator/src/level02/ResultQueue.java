package level02;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ResultQueue {
    private Queue<Double> queue = new ArrayDeque<>();

    public void add(Double value) {
        if (queue.size() >= 10) {
            queue.poll();
        }
        queue.offer(value);
    }

    public ArrayDeque getter() {
        return (ArrayDeque) queue;
    }

    public List<Double> getGreaterThan(double threshold) {
        List<Double> resultList = new ArrayList<>();
        for (Double value : queue) {
            if (value > threshold) {
                resultList.add(value);
            }
        }
        return resultList;
    }
}
