package base;

import java.util.ArrayList;

public class Person{
    int personID;
    static ArrayList<Person> personList = null;
    String name;
    String nationalID;

    public Person(String newName, String newNationalID){
      this.name = newName;
      this.nationalID = newNationalID;

      if(personList == null)
      personList = new ArrayList<>();

      this.personID = personList.size() + 1;
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
