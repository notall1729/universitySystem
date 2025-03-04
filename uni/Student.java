package uni;

import java.util.ArrayList;

public class Student {
    int studentID;
    static ArrayList<Student> studentList = null;
    int personID;
    final int entranceYear;
    static int majorID;
    String studentCode;

    public Student(int personID, int entranceYear, int majorID) {
        this.personID = personID;
        this.entranceYear = entranceYear;
        this.majorID = majorID;

        Major major = Major.findById(majorID);
        setStudentCode();

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
        String studentCode = String.valueOf(entranceYear) + String.valueOf(majorID) + String.valueOf(personID);


    }
}
