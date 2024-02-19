package myanimals;

public class Cat {
    public static final int MAX_LIVES = 9;
    private static int numOfAnimals = 0;
    String name;
    int age;
    int livesRemaining;

    public void meow () {
        System.out.println("Meow");
    }
    public Cat () {
        numOfAnimals++;
        livesRemaining = MAX_LIVES;
    }
    public static int getNumOfAnimals() {
        return numOfAnimals;
    }
}