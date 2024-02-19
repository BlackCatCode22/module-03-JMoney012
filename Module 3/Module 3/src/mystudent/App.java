package mystudent;

public class App {
    public static void main(String[] args) {

        //Here we are creating a student object 1
        Student myStudent = new Student();

        // Here is the myStudent's data
        myStudent.firstName = "John";
        myStudent.lastName = "Hernandez";
        myStudent.city = "Fresno";
        myStudent.major = "Computer Science";
        myStudent.gpa = 3.8;
        myStudent.onProbation = false;

        System.out.println(" \n The first name of the student is: " + myStudent.firstName + "\n");
        System.out.println("\n The last name of the student is: " + myStudent.lastName + "\n");


    }
}
