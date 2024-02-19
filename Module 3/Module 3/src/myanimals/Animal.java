package myanimals;

public class Animal {
    public static void main(String[] args) {
        System.out.println(Cat.getNumOfAnimals());

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Whiskers";
        myCat.age = 3;
        myCat.livesRemaining = 2;

        Cat myCat2 = new Cat();
        myCat2.meow();
        myCat2.name = "Raider";
        myCat2.age = 9;
        myCat2.livesRemaining = 1;

        Dog myDog = new Dog();
        myDog.woof();
        myDog.name = "Champ";
        myDog.age = 12;

        Dog myDog2 = new Dog();
        myDog2.woof();
        myDog2.name = "Max";
        myDog2.age = 10;



        System.out.println(Cat.MAX_LIVES);
        System.out.println(Cat.getNumOfAnimals());



    }
}
