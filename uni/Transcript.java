package uni;

import java.util.HashMap;
import java.util.Map;

public class Transcript {
    int studentID;
    public Map<Integer, Double> transcript;

    public Transcript(int studentID){
        this.studentID = studentID;
        this.transcript = new HashMap<>();
    }

    public void setGrade (int presentedCourseID, double grade, PresentedCourse course){

        if(course.getStudentIDList().contains(studentID))
            transcript.put(presentedCourseID, grade);
        else System.out.println("Student is not enrolled in this course.");
    }

    public void printTranscript(Map<Integer, String> courseTitles){
      System.out.println("Transcript for student ID: " + studentID);
      for(int courseID : transcript.keySet()){
          double grade = transcript.get(courseID);
          String courseTitle = courseTitles.getOrDefault(courseID, "Unknoen course");
          }
      }

    public double getGPA(Map <Integer, Double> courseCredits){
     if(transcript.isEmpty())
         return 0.0;

     double totalGradePoint = 0;
     int totalCredits = 0;

     for(int courseID : transcript.keySet()){
         double grade = transcript.get(courseID);
         double credits = courseCredits.getOrDefault(courseID, 0.0);
         totalGradePoint += grade * credits;
         totalCredits += credits;
     }

     if(totalCredits == 0)
         return 0.0;

      return totalGradePoint / totalCredits;
    }

    public Map<Integer, Double> getTranscript(){

        return transcript;
    }
}
