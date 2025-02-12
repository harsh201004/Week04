package universitycoursemanagementsystem;

public class UniversityManagementSystemMain {
    public static void main(String[] args) {
        Course<ExamCourse> examCourses =  new Course<>();
        examCourses.addCourse(new ExamCourse("Math Exam"));
        examCourses.addCourse(new ExamCourse("Physics Exam"));

        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("History Assignment"));
        assignmentCourses.addCourse(new AssignmentCourse("Geography Assignment"));

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("AI Research"));
        researchCourses.addCourse(new ResearchCourse("ML Research"));

        System.out.println("Exam Courses: ");
        CourseUtility.displayCourses(examCourses.getCourse());
        System.out.println("-------------------------------");

        System.out.println("Assignment Courses: ");
        CourseUtility.displayCourses(assignmentCourses.getCourse());
        System.out.println("-------------------------------");

        System.out.println("Research Courses: ");
        CourseUtility.displayCourses(researchCourses.getCourse());
    }
}
