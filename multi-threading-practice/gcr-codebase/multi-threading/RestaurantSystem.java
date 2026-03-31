class Chef extends Thread {

    private String dish;
    private int totalTime;

    public Chef(String name, String dish, int totalTime) {
        super(name);
        this.dish = dish;
        this.totalTime = totalTime;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started preparing " + dish);

        int stepTime = totalTime / 4;

        try {
            for (int i = 1; i <= 4; i++) {
                Thread.sleep(stepTime);
                System.out.println(
                    getName() + " preparing " + dish + ": " + (i * 25) + "% complete"
                );
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(getName() + " completed " + dish);
    }
}

public class RestaurantSystem {

    public static void main(String[] args) throws InterruptedException {

        Chef chef1 = new Chef("Chef-1", "Pizza", 3000);
        Chef chef2 = new Chef("Chef-2", "Pasta", 2000);
        Chef chef3 = new Chef("Chef-3", "Salad", 1000);
        Chef chef4 = new Chef("Chef-4", "Burger", 2500);

        chef1.start();
        chef2.start();
        chef3.start();
        chef4.start();

        chef1.join();
        chef2.join();
        chef3.join();
        chef4.join();

        System.out.println("Kitchen closed - All orders completed");
    }
}
