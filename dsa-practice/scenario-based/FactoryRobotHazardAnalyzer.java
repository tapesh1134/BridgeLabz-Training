
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class RobotSafetyException extends Exception {

    public RobotSafetyException(String message) {
        super(message);
    }
}

class RobotHazardAuditor {

    private Map<String, Double> machineMap;

    public RobotHazardAuditor() {
        machineMap = new HashMap<>();
        machineMap.put("worn", 1.3);
        machineMap.put("faulty", 2.0);
        machineMap.put("critical", 3.0);
    }

    public double CalculateHazardRisk(double armPrecision, int workDensity, String machineryState) throws RobotSafetyException {
        if (armPrecision < 0.0 || armPrecision > 1.0) {
            throw new RobotSafetyException("Error: Arm perision must be 0.0-1.0");
        }
        if (workDensity < 1 || workDensity > 20) {
            throw new RobotSafetyException("Error: Work density must be 1-20");
        }
        if (!machineMap.keySet().contains(machineryState.toLowerCase())) {
            throw new RobotSafetyException("Error: Unsupported machinery state");
        }
        double hazardRisk = ((1.0 - armPrecision) * 15.0) + (workDensity * machineMap.get(machineryState.toLowerCase()));
        return hazardRisk;
    }
}

public class FactoryRobotHazardAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter arm perision (0.0-1.0):");
        double armPrecision = scanner.nextDouble();
        System.out.println("Enter work density (1-20):");
        int workDensity = scanner.nextInt();
        System.out.println("Enter machinery state (Worn,Faulty,Critical):");
        String machineState = scanner.next();

        RobotHazardAuditor robotHazardAuditor = new RobotHazardAuditor();
        try {
            System.out.println(robotHazardAuditor.CalculateHazardRisk(armPrecision, workDensity, machineState));
        } catch (RobotSafetyException e) {
            e.printStackTrace();
        }
    }
}
