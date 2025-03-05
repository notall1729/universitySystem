package uni;

import java.util.ArrayList;

public class Professor {
    public int professorID;
    static ArrayList<Professor> professorList = new ArrayList<>();
    int personID;
    int majorID;

    public Professor(int personID, int majorID){
        this.personID = personID;
        this.majorID = majorID;

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
