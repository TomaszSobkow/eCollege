package topic2.Assignment1_8;

public class Assignment1_8A {




    public static void main(String[] args) {
        ChickenA c1 = new ChickenA();
        ChickenA c2 = new ChickenA();
        ChickenA c3 = c2;
        System.out.println(ChickenA.noChicken);
        //c2 = null;
        c3 = null;
        System.out.println( c2.equals(c3));
        System.out.println(ChickenA.noChicken+" after gc?");

    }
}

class ChickenA{
    static int noChicken;

    public ChickenA(){
        noChicken++;
    }
}
