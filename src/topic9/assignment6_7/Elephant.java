package topic9.assignment6_7;

public class Elephant extends Animal{
    public Elephant(String name, int age, boolean isHungry) {
        super(name, age, isHungry);
    }

    public Elephant() {
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+" "+super.toString();
    }

    @Override
    String feed() {
        return "Elephant "+ super.getName()+" is being fed, he eats hay !!";
    }

    @Override
    String performTrick() {
        return "Elephant "+ super.getName()+" blows with his trunk!";
    }
}
