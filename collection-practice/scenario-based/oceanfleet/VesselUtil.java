
import java.util.ArrayList;
import java.util.List;

public class VesselUtil {

    private List<Vessel> vesselList;

    public VesselUtil() {
        vesselList = new ArrayList<>();
    }

    public List<Vessel> getVesselList() {
        return vesselList;
    }

    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    public Vessel getVesselById(String vesselId) {
        for (Vessel vessel : vesselList) {
            if (vessel.getVesseId().equals(vesselId)) {
                return vessel;
            }
        }
        return new Vessel();
    }

    public List<Vessel> getHighPerformanceVessels() {
        double maxSpeed = 0.0;
        for (Vessel vessel : vesselList) {
            if (Double.parseDouble(vessel.getAverageSpeed()) > maxSpeed) {
                maxSpeed = Double.parseDouble(vessel.getAverageSpeed());
            }
        }
        List<Vessel> highPerformanceVesselList = new ArrayList<>();
        for (Vessel vessel : vesselList) {
            if (Double.parseDouble(vessel.getAverageSpeed()) == maxSpeed) {
                highPerformanceVesselList.add(vessel);
            }
        }
        return highPerformanceVesselList;
    }
}
