
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class InvalidResumeException extends Exception {

    public InvalidResumeException(String message) {
        super(message);
    }
}

class Resume {

    private String name;
    private Set<String> skills;

    public Resume(String name, Set<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public Set<String> getSkills() {
        return skills;
    }
}

public class ResumeShortlistingSystem {

    public static void main(String[] args) throws InvalidResumeException {
        Scanner sc = new Scanner(System.in);
        List<Resume> resumes = new ArrayList<>(List.of(
                new Resume("Tapesh", new HashSet<String>(Arrays.asList("Java", "C++", "Python"))),
                new Resume("Sam", new HashSet(Arrays.asList("Python", "ReactJs")))
        ));
        System.out.println("Enter Skills");
        Set<String> skills = new HashSet<>(Arrays.asList(sc.nextLine().split(" ")));
        boolean match = resumes.stream()
                .anyMatch(r -> r.getSkills().stream()
                .anyMatch(skills::contains));

        if (!match) {
            throw new InvalidResumeException("No resume found");
        }
        Comparator<Resume> sortResumes= Comparator.comparingLong(
                r -> r.getSkills()
                        .stream()
                        .filter(skills::contains)
                        .count()
        );
        for (Resume resume : resumes) {
            System.out.println("Name: " + resume.getName());
            System.out.println("skills: ");
            for (String skill : resume.getSkills()) {
                System.out.println(skill);
            }
        }
        sc.close();
    }
}
