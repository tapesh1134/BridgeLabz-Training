
class Booking extends Flight implements CalculateBill {

    private int userId;
    private String userName;
    private int amount;

    Booking(int planeId, String planeName, String source, String destination,
            int distance, int userId, String userName, int amount) {
        super(planeId, planeName, source, destination, distance);
        this.userId = userId;
        this.userName = userName;
        this.amount = amount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public int calculateBill() {
        return getDistance() * amount;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("User ID :- " + userId);
        System.out.println("User Name :- " + userName);
        System.out.println("Flight Source :- " + getSource());
        System.out.println("Flight Destination :- " + getDestination());
        System.out.println("Distance :- " + getDistance());
        System.out.println("Total Bill :- " + calculateBill());
    }
}
