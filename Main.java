import base.Person;
import uni.*;

public class Main {

    public static void printStudentInformation(Person person, String number){

        System.out.println(number+ " student: \n  name: " +person.name+ "\n  nationalID: " +person.nationalID+ "\n");
    }

    public static void printProfessorInformation(Person person, String number){

        System.out.println(number+ " professor: \n  name: " +person.name+ "\n  personID: " +person.personID+ "\n");
    }

    public static void main(String[] args) {
        Person Nima = new Person("Nima", "0072886676", 1);
        Person Shadi = new Person("Shadi", "0200605402", 2);
        Person Maryam = new Person("Maryam", "0032886675", 3);
        Person Parnia = new Person("Parnia", "0765672234", 4);
        Person Ali = new Person("Ali", "00200347809", 5);

        Major math = new Major("Math", 49);
        Major computerScience = new Major("Computer science", 87);

        Student firstStudent = new Student(1, 403, math.majorID);
        Student secondStudent = new Student(2,403, math.majorID);
        Student lastStudent = new Student(5, 402, computerScience.majorID);

        printStudentInformation(Nima, "First");
        printStudentInformation(Shadi, "Second");
        printStudentInformation(Ali, "Last");

        Professor firstProfessor = new Professor(3, math.majorID);
        Professor secondProfessor = new Professor(4, computerScience.majorID);

        printProfessorInformation(Maryam, "First");
        printProfessorInformation(Parnia, "Second");

        Course BP = new Course("Basic programming", 11);
        Course AP = new Course("Advanced programming", 15);
        Course GeneralMath1 = new Course("General math 1", 6);

        PresentedCourse bp = new PresentedCourse()



    }
}