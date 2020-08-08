package topic2.Assignment1_5;

import topic2.Assignment1_5.packageA.ClassA;
import topic2.Assignment1_5.packageB.ClassB;

public class Assignment1_5 {
    public static void main(String[] args) {
        new ClassA();

        System.out.println(new ClassA().getNoObjCreated()+" ClassA object(s) created");
        System.out.println(new ClassB().getNoObjCreated()+ " ClassB object(s) created");
    }
}
