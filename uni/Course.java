package uni;

import java.util.ArrayList;

public class Course {
    int courseID;
    static ArrayList<Course> courseList = null;
    String title;
    int units;

    public Course( String newTitle, int newUnits){
        title = newTitle;
        units = newUnits;

        if(courseList == null)
            courseList = new ArrayList<>();

        courseList.add(this);
        courseID = courseList.size();
    }

    public static Course findById(int ID){
        if(courseList != null){
            for(Course course : courseList){
                if(course.courseID == ID){
                    return course;
                }
            }
        }
        return null;
    }

}
