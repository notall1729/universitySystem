package base;

import java.util.ArrayList;

public class Person{
    public int personID;
    static ArrayList<Person> personList = null;
    public String name;
    public String nationalID;

    public Person(String name, String nationalID, int personID){
      this.name = name;
      this.nationalID = nationalID;
      this.personID = personID;

      if(personList == null)
      personList = new ArrayList<>();

      personList.add(this);
    }

    public static Person findId(int ID){
        if(personList != null) {
            for (Person person : personList) {
                if (person.personID == ID) {
                    return person;
                }
            }
        }
        return null;
    }
}
