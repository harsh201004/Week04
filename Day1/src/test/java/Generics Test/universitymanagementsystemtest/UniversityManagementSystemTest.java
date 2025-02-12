package universitymanagementsystemtest;


import org.junit.Assert;
import org.junit.Test;

import universitycoursemanagementsystem.ExamCourse;
import universitycoursemanagementsystem.AssignmentCourse;
import universitycoursemanagementsystem.ResearchCourse;
import universitycoursemanagementsystem.Course;

public class UniversityManagementSystemTest {
   @Test
    public void test1() {
       // Test for ExamCourses
       Course<ExamCourse> examCourses = new Course<>();
       ExamCourse mathExam = new ExamCourse("Math Exam");
       examCourses.addCourse(mathExam);
       Assert.assertEquals(1, examCourses.getCourse().size());
   }

   @Test
   public void test2() {
      // Test for AssignmentCourses
      Course<AssignmentCourse> assignmentCourses = new Course<>();
      AssignmentCourse historyAssignment = new AssignmentCourse("History Assignment");
      assignmentCourses.addCourse(historyAssignment);
      Assert.assertEquals("History Assignment", assignmentCourses.getCourse().get(0).getCourseName());

   }

   @Test
   public void test3() {
      // Test for ResearchCourses
      Course<ResearchCourse> researchCourses = new Course<>();
      ResearchCourse aiResearch = new ResearchCourse("AI Research");
      researchCourses.addCourse(aiResearch);
      Assert.assertEquals("AI Research", researchCourses.getCourse().get(0).getCourseName());

   }

}
