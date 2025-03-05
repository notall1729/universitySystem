import base.Person;
import uni.*;

public class Main {

    public static void printStudentInformation(Person person, String number){

        System.out.println("---------------------------");
        System.out.println(number+ " student: \n  name: " +person.name+ "\n  nationalID: " +person.nationalID+ "\n");
    }

    public static void printProfessorInformation(Person person, String number){

        System.out.println("---------------------------");
        System.out.println(number+ " professor: \n  name: " +person.name+ "\n  personID: " +person.personID+ "\n");
    }

    public static void printTranscript(String information, Transcript transcript, String firstCourse, String secondCourse, double GPA){

        int i =0;
        System.out.println("---------------------------");
        System.out.println(information);
        for(int key : transcript.transcript.keySet()) {
            if(i == 0)
                System.out.println(firstCourse+ ": ");
            if(i == 1)
                System.out.println(secondCourse+ ": ");

            System.out.println(transcript.transcript.get(key));
        }
        System.out.println("GPA: "+GPA);

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

        Professor firstProfessor = new Professor(3, computerScience.majorID);
        Professor secondProfessor = new Professor(4, math.majorID);

        printProfessorInformation(Maryam, "First");
        printProfessorInformation(Parnia, "Second");

        Course BP = new Course("Basic programming", 11);
        Course AP = new Course("Advanced programming", 15);
        Course GeneralMath1 = new Course("General math 1", 6);

        PresentedCourse bp = new PresentedCourse(BP.courseID, firstProfessor.professorID, 67);
        PresentedCourse ap = new PresentedCourse(AP.courseID, firstProfessor.professorID, 73);
        PresentedCourse generalMath1 = new PresentedCourse(GeneralMath1.courseID, secondProfessor.professorID, 57);


        bp.addStudent(firstStudent.studentID);
        bp.addStudent(secondStudent.studentID);

        ap.addStudent(firstStudent.studentID);
        ap.addStudent(secondStudent.studentID);
        ap.addStudent(lastStudent.studentID);

        generalMath1.addStudent(lastStudent.studentID);

        Transcript nimaTranscript = new Transcript(firstStudent.studentID);
        Transcript shadiTranscript = new Transcript(secondStudent.studentID);
        Transcript aliTranscript = new Transcript(lastStudent.studentID);

        nimaTranscript.setGrade(bp.presentedCourseID, 16.25, bp);
        nimaTranscript.setGrade(ap.presentedCourseID, 14, ap);

        shadiTranscript.setGrade(bp.presentedCourseID, 18, bp);
        shadiTranscript.setGrade(ap.presentedCourseID, 17.75, ap);

        aliTranscript.setGrade(ap.presentedCourseID, 16.45, ap);
        aliTranscript.setGrade(generalMath1.presentedCourseID, 19.25, generalMath1);

        double nimaGPA= nimaTranscript.getGPA(nimaTranscript.transcript);
        double shadiGPA = shadiTranscript.getGPA(shadiTranscript.transcript);
        double aliGPA = aliTranscript.getGPA(aliTranscript.transcript);

       printTranscript("Nima`s transcript", nimaTranscript, "Basic programming", "Advanced programming", nimaGPA);
       printTranscript("Shadi`s transcript", shadiTranscript, "Basic programming", "Advanced programming", shadiGPA);
       printTranscript("Ali`s transcript", aliTranscript, "Advanced programming", "General math1", aliGPA);





    }

}