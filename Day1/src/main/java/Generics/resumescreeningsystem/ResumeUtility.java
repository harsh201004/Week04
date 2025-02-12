package resumescreeningsystem;
import java.util.*;

public class ResumeUtility {
    public static void displayResumes(List<? extends JobRole> resumes) {
        for(JobRole resume : resumes) {
            System.out.println(resume.getCandidateName() + ": " + resume.getResumeDetails());
        }

    }

}
