package resumescreeningsystem;
import java.util.*;

public class Resume<T extends JobRole> {
    private List<T> resumeList = new ArrayList<>();

    public void addResume(T resume) {
        resumeList.add(resume);
    }

    public List<T> getResumes() {
        return resumeList;
    }

}
