
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

class StateMonitor extends Thread {

    private Thread[] threads;
    private Map<String, Integer> stateCount = new HashMap<>();

    public StateMonitor(Thread... threads) {
        this.threads = threads;
    }

    @Override
    public void run() {

        boolean allTerminated = false;

        while (!allTerminated) {
            allTerminated = true;

            for (Thread t : threads) {
                Thread.State state = t.getState();
                String name = t.getName();

                System.out.println(
                    "[Monitor] " + name + " is in " + state +
                    " state at " + LocalTime.now()
                );

                stateCount.put(
                    name + "-" + state,
                    stateCount.getOrDefault(name + "-" + state, 0) + 1
                );

                if (state != Thread.State.TERMINATED) {
                    allTerminated = false;
                }
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Monitor interrupted");
            }
        }
    }

    public void printSummary() {
        System.out.println("\nSummary:");
        stateCount.keySet().forEach(System.out::println);
    }
}

class TaskRunner extends Thread {

    public TaskRunner(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 1_000_000; i++) {
                Math.sqrt(i);
            }
            Thread.sleep(2000);
            for (int i = 0; i < 500_000; i++) {
                Math.log(i + 1);
            }

        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted");
        }
    }
}

public class ThreadStateMonitorSystem {

    public static void main(String[] args) throws InterruptedException {

        TaskRunner task1 = new TaskRunner("Task-1");
        TaskRunner task2 = new TaskRunner("Task-2");

        StateMonitor monitor = new StateMonitor(task1, task2);
        monitor.start();

        Thread.sleep(500);

        task1.start();
        task2.start();

        task1.join();
        task2.join();
        monitor.join();

        monitor.printSummary();
    }
}