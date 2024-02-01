
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Doctor {

    String name;
    boolean availableWeekend;
    String specialty;

    public Doctor(String name, boolean availableWeekend, String specialty) {
        this.name = name;
        this.availableWeekend = availableWeekend;
        this.specialty = specialty;
    }
}

public class DoctorAvailability {

    public static void main(String[] args) {
        List<Doctor> doctorList = new ArrayList<>();
        doctorList.add(new Doctor("Amit", false, "Bone"));
        doctorList.add(new Doctor("Raj", true, "Ears"));
        doctorList.add(new Doctor("Rohan", true, "Skin"));

        doctorList.stream()
                .filter(n -> n.availableWeekend)
                .sorted(Comparator.comparing(n -> n.specialty))
                .forEach(n -> System.out.println(n.name));
    }
}
