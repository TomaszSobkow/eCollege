package topic9.assignment6_7;

public abstract class Animal {

    private String name;
    private int age;
    private boolean isHungry;

    public Animal(String name, int age, boolean isHungry) {
        this.name = name;
        if(age < 0){this.age = 0;}
        else {this.age = age; }
        this.isHungry = isHungry;
    }

    abstract String feed();
    abstract String performTrick();

    public Animal() {
        this("Unknown",0,false);
    }

    @Override
    public String toString() {
        return "\nName:   " + name +
                "\nage:    " + age +
                "\nisHungry:" + isHungry+"\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
}
