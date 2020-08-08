package topic9.exceptions.exceptionMain;

import java.security.spec.NamedParameterSpec;

public class EmployeeApp extends EmployeeImplement {
    Employee[] allEmployees;
     static String name;
    public static void main(String[] args) throws InvalidOperationException{


//        EmployeeImplement empImpl = new EmployeeImplement();
//
//        Employee tom = new Employee(0,"Tomek","Java developer");
//        Employee aga = new Employee(1,"Aga","HTML");
//        Employee john = new Employee(2,"John","SQL");
//        Employee simon = new Employee(3,"Simon","Design");
//
//        empImpl.add(tom);
//        empImpl.add(aga);
//        empImpl.add(john);
//        empImpl.add(simon);
//        try{
//            System.out.println("Catch block ");
//        }finally {
//            System.out.println("in finally block");
//        }


       String secondanme =  name.replace("", "");
        System.out.println(secondanme);


    }
}
