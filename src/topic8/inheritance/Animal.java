package topic8.inheritance;

public abstract class  Animal {

    private  String name;
    private  int age;


    public Animal(int age, String name) {
        if(name.isEmpty()){this.name = "Unknown";}
        else {this.name = name;}

        if(age <= 0){this.age = 1;}
        else { this.age = age;  }
    }


    public String toString() {
        return "Animal: " +getClass().getSimpleName()+"\nName: "+this.name+"\nAge: "+this.age;
    }

    public  abstract String getVoice();

}
