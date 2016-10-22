package Prototype;

public class Main {

    public static void main(String[] args){
        Animal cow = new Cow();
        Animal pig = new Pig();

        cow.speak();
        pig.speak();

        AnimalFactory af = new AnimalFactory();

        Animal clone = pig.Clone();
        clone.speak();
    }
}
