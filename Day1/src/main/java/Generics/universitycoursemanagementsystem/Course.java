package universitycoursemanagementsystem;

import java.util.ArrayList;
import java.util.List;

//Gneric class Course
public class Course<T extends CourseType> {
    ArrayList<T> courseList = new ArrayList<>();

    public void addCourse(T course) {
        courseList.add(course);
    }

    public List<T> getCourse() {
        return courseList;
    }
}
