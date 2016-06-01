package certification.examples.polymorphism.morph;

import certification.examples.polymorphism.classes.Adult;
import certification.examples.polymorphism.classes.Child;
import certification.examples.polymorphism.classes.Human;
import certification.examples.polymorphism.classes.Shannon;

/**
 *
 */
public class PolymorphismExample {

    public static void main(String[] args) {
        Human human = new Human();
        human.speak();
        Human adultHuman = new Adult();
        adultHuman.speak();
        Human childHuman = new Child();
        childHuman.speak();
        Human shannonHuman = new Shannon();
        shannonHuman.speak(); // You'll notice that you get the Shannon implementation.

        Adult shannonAdult = new Shannon();
        shannonAdult.speak(); // You'll notice that you get the Shannon implementation here too

        Shannon plainShannon = new Shannon();
        plainShannon.speak();

        System.out.println("\n");
        System.out.println("Here goes my casting.");
        //This works ok
        Human humanShannon = (Human) plainShannon; // The cast to Human is redundant as it is casting to a parent class
        humanShannon.speak(); // This also gets the Shannon implementation

        // I know that my humanShannon is a Shannon, so I can safely cast back to a Shannon, but
        // I need to do this to get the more specific functionality provided by Shannon.
        Shannon recreateShannon = (Shannon) humanShannon;
        recreateShannon.speakAboutShannon();

//        Human h = (int) humanShannon; // Compile time error as an int and human are incompatible types
        // Remove the above comment

        Object o =  humanShannon; // Allowed.

        Integer i = (int) o; // No compile time error but you will get a class cast exception.
    }
}
