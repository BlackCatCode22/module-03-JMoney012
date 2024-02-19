package mystuff;

import com.sun.security.jgss.GSSUtil;

public class Driver {
    public static void main(String[] args) {

        //Creating new object
        Stuff myMachine = new Stuff();

        // Filling in data fields
        myMachine.machine = "My Phone";
        myMachine.machineName = "Samsung S22 Ultra";
        myMachine.machineYear = "2022";
        myMachine.machineOs = "Android";

        System.out.println("\n John's most used device: " + myMachine.machine + "\n");
        System.out.println("\n The year purchased: " + myMachine.machineYear + "\n");
        System.out.println(" \n The Operating System is: " + myMachine.machineOs + "\n");
        System.out.println("\n Did you guess: " + myMachine.machineName + "? \n");

    }
}
