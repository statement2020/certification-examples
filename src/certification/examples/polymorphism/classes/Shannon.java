package certification.examples.polymorphism.classes;

/**
 *
 */
public class Shannon extends Adult {
    @Override
    public void speak() {
        System.out.println("Shannon speaking with my cockney accent");
    }

    public void speakAboutShannon(){
        System.out.println("I'm going to speak about Shannon");
    }
}
