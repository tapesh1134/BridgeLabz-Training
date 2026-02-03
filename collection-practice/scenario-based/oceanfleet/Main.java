
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VesselUtil vesselUtil = new VesselUtil();
        System.out.println("Enter the number of vessels to be added");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter vessel details");
        for (int i = 0; i < number; i++) {
            String input[] = sc.nextLine().split(":");
            vesselUtil.addVesselPerformance(new Vessel(input[0], input[1], input[2], input[3]));
        }
        System.out.println("\nEnter the Vessel Id to check speed");
        String input = sc.next();
        System.out.println(vesselUtil.getVesselById(input).toString());
        System.out.println("\nHigh performance vessels are");
        vesselUtil.getHighPerformanceVessels().forEach(Vessel -> System.out.println(Vessel.toString()));
        sc.close();
    }
}
