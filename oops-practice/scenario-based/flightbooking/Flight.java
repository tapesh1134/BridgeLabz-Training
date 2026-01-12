
class Flight extends Plane {

    private String source;
    private String destination;
    private int distance;

    Flight(int planeId, String planeName, String source, String destination, int distance) {
        super(planeId, planeName);
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getDistance() {
        return distance;
    }
}
