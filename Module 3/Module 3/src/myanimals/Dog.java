package myanimals;

public class Dog {
    private static int numOfAnimals = 0;
    String name;
    int age;
    public void woof () {
        System.out.println("Woof");
    }
    public Dog() {
        numOfAnimals++;
    }

    public static int getNumOfAnimals() {
        return numOfAnimals;
    }
}
