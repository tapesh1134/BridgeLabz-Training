
public class Vessel {

    private String vesseId;
    private String vesselName;
    private String averageSpeed;
    private String vesselType;

    public Vessel() {

    }

    public Vessel(String vesselId, String vesselName, String averageSpeed, String vesselType) {
        this.vesseId = vesselId;
        this.vesselName = vesselName;
        this.averageSpeed = averageSpeed;
        this.vesselType = vesselType;
    }

    public String getVesseId() {
        return vesseId;
    }

    public String getVesselName() {
        return vesselName;
    }

    public String getAverageSpeed() {
        return averageSpeed;
    }

    public String getVesselType() {
        return vesselType;
    }

    @Override
    public String toString() {
        return vesseId + " | " + vesselName + " | " + vesselType + " | " + averageSpeed + " knots";
    }
}
