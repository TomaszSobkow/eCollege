package topic9.zoo;

public class ZooWorker {
    public static void feed(Reptile reptile){
        System.out.println("Feeding reptile: "+reptile.getName());
    }

    public static void main(String[] args) {
        //feed(new Reptile());
        feed(new Alligator());
        feed(new Crocodile());
    }
}
