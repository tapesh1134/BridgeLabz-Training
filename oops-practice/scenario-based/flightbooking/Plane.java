
abstract class Plane {

    private int planeId;
    private String planeName;

    Plane(int planeId, String planeName) {
        this.planeId = planeId;
        this.planeName = planeName;
    }

    public int getPlaneId() {
        return planeId;
    }

    public String getPlaneName() {
        return planeName;
    }

    void displayInfo() {
        System.out.println("Plane ID :- " + planeId);
        System.out.println("Plane Name :- " + planeName);
    }
}
