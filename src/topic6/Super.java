package topic6;

 class Super {
    static int noOfHits;

    static {
        noOfHits++;
        System.out.println("im in static field");
    }

    {
        noOfHits++;
        System.out.println("im in field");
    }

}

class A extends Super {}
class B extends Super {}

class QOD {

    public static void main(String[] args){
//        A a1 = new A();
//        B b1 = new B();
        System.out.println(Super.noOfHits);
    }

}
