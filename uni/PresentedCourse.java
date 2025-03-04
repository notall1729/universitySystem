package uni;

import java.util.ArrayList;

public class PresentedCourse {
    int presentedCourseID;
    static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<>();
    int courseID;
    int professorID;
    int maxCapacity;
    public ArrayList<Integer> studentIDList = new ArrayList<>();

        public PresentedCourse(int newCourseID, int newProfessorID, int newMaxCapacity) {
            this.courseID = newCourseID;
            this.professorID = newProfessorID;
            this.maxCapacity = newMaxCapacity;

            this.presentedCourseID = presentedCourseList.size();

            presentedCourseList.add(this);
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
            if(studentIDList.size() <  maxCapacity)
                studentIDList.add(newStudentID);

            else System.out.println("Capacity is complete. you cant add anyone else.");
    }

    public ArrayList<Integer> getStudentIDList(){
            return studentIDList;
    }
}
