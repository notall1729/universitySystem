package uni;

import java.util.ArrayList;

public class Major {
    public int majorID;
    static ArrayList<Major> majorlist = null;
    String name;
    final int maxCapacity;
    int numberOfStudents = 0;

    public Major(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;

        if (majorlist == null)
            majorlist = new ArrayList<>();

        this.majorID = majorlist.size() + 1;
        majorlist.add(this);
    }

    public static Major findById(int ID) {
        if (majorlist != null) {
            for (Major major : majorlist) {
                if (major.majorID == ID) {
                    return major;
                }
            }
        }
        return null;
    }

    public void addStudent() {
        if (numberOfStudents <= maxCapacity)
            numberOfStudents++;

        else
            System.out.println("Capacity is complete. you cant add anyone else.");
    }
}
