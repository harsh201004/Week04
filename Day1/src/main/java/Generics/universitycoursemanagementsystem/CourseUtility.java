package universitycoursemanagementsystem;
import java.util.*;

public class CourseUtility {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}
