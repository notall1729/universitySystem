package uni;

import java.util.ArrayList;

public class Professor {
    int professorID;
    static ArrayList<Professor> professorList = null;
    int personID;
    int majorID;

    public Professor(int newPersonID, int newMajorID){
        personID = newPersonID;
        majorID = newMajorID;

        if(professorList != null)
            professorList =  new ArrayList<>();

        professorList.add(this);

        professorID = professorList.size();
    }

    public static Professor findById (int ID){
        if(professorList != null){
            for(Professor professor : professorList){
                if(professor.professorID == ID){
                    return professor;
                }
            }
        }
        return null;
    }
}
