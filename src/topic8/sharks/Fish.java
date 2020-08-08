package topic8.sharks;

public class Fish {

    protected int size;
    private int age;


    public Fish(int age, int size){
        if(size < 0 ){this.size = 0;}
        else{this.size = size;}

        if(age < 1 ){this.age =1;}
        else {this.age = age;}
    }

    public long getAge(){return age;}
    public void setSize(int size) { this.size = size; }


    void print(){
        System.out.println("Print in Fish");
    }
}
