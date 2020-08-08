package topic9.assignment6_7;

public class Penguin extends Animal{
    public Penguin(String name, int age, boolean isHungry) {
        super(name, age, isHungry);
    }

    public Penguin() {
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+" "+super.toString();
    }

    @Override
    String feed() {
        return "Penguin "+ super.getName()+" is being fed. He eats fish from a bucket !!";
    }

    @Override
    String performTrick() {
        return "Penguin "+ super.getName()+" Flaps wings!";
    }
}
