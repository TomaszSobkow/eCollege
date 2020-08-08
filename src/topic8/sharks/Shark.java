package topic8.sharks;

public class Shark extends Fish{
    private int numberOfFins = 8;


    public Shark(int age, int size){
        super(age,size);
    }

    public Shark(int age){
        this(age,0);
    }

    public Shark(){
        this(0);
    }


            public static void main(String[] args) {
                new Shark(12).print();
            }



    public  void print(){
        System.out.println("Print in Shark");
    }

    public void displaySharks(){
        System.out.println("Shark with age " + getAge());
        System.out.println(" and "+ size+ " metres long");
        System.out.println(" with "+ numberOfFins+ "fins ");
    }


}
