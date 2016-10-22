package Prototype;

public abstract class Animal implements Cloneable{
    protected String type;
    public Animal Clone(){
        Animal clone = null;
        try {
            clone = (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
    public abstract void speak();
}
