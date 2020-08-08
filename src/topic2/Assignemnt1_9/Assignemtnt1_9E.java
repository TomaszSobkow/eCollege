package topic2.Assignemnt1_9;

public class Assignemtnt1_9E {
    private static float price;
    public static int noOvjects;

    Assignemtnt1_9E(float priceAdded){
        this.price += priceAdded;
        noOvjects++;
    }

    public float getAverage(){
        return this.price / noOvjects;
    }

    public static void main(String[] args) {
        Assignemtnt1_9E p1 = new Assignemtnt1_9E(3.4f);
        Assignemtnt1_9E p2 = new Assignemtnt1_9E(5.6f);
        Assignemtnt1_9E p3 = new Assignemtnt1_9E(3);
        System.out.println(Assignemtnt1_9E.noOvjects+" Peach object have been created. "+
                "\nThe average price of a peach is "+p3.getAverage());
    }

}
