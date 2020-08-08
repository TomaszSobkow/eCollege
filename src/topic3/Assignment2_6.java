package topic3;

public class Assignment2_6 {

    public static void main(String[] args) {
//        boolean isStudent = true;
//        double distanceThreshold = 10.00, distanceToTravel = 2.03;
//
//       double dystance = (isStudent)?(distanceToTravel > distanceThreshold)? 200:100:0;
//        System.out.println(dystance);

        Cat c = new Cat();
        c.name = "Tom";
        Cat v = new Cat();
        v.name = "Tom";

        System.out.println((c.name == v.name) + " --> "+ c.name.equals(v.name));
        System.out.println(c!=v);


    }
}

class Cat{
     String name;


}
