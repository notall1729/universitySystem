package uni;

import java.util.ArrayList;

public class Student {
    int studentID;
    static ArrayList<Student> studentList = null;
    int personID;
    final int entranceYear;
    int majorID;
    String studentCode;

    public Student(int newPersonID, int newEntranceYear, int majorID) {
        personID = newPersonID;
        entranceYear = newEntranceYear;
        Major major = new Major();
        major.addStudent();
    }

    public static Student findById(int ID) {
        if (studentList != null) {
            for (Student student : studentList) {
                if (student.studentID == ID){
                    return student;
                }
            }
        }
        return null;

    }

    public void setStudentCode(){
        String studentCode = String.valueOf(entranceYear) + String.valueOf(majorID) + studentList.size();


    }
}
