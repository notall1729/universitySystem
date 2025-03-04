package uni;

import java.util.ArrayList;

public class PresentedCourse {
    int peresentedCourseID;
    static ArrayList<PresentedCourse> presentedCourseList = null;
    int courseID;
    int professorID;
    int maxCapacity;
    ArrayList<Integer> studentIDList = null;

        public PresentedCourse(int newCourseID, int newProfessorID, int newMaxCapacity) {\
            courseID = newCourseID;
            professorID = newProfessorID;
            maxCapacity = newMaxCapacity;

            courseID = presentedCourseList.size();
        }

        public static PresentedCourse findById(int ID){
            if(presentedCourseList != null){
                for(PresentedCourse presentedCourse : presentedCourseList){
                    if(presentedCourse.courseID == ID){
                        return presentedCourse;
                    }
                }
            }
            return null;
    }

    public void addStudent(int newStudentID){
            if(studentIDList.size() <= maxCapacity)
                studentIDList.add(newStudentID);

            else System.out.println("Capacity is complete. you cant add anyone else.")
    }
}
