package topic2.Assignment1_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment1_4 {
    static Scanner scanner;
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        while (true){
            scanner = new Scanner(System.in);
            System.out.print("Enter first number please: ");
            try {
                calculator.setNo1(scanner.nextInt());
                break;
            }catch (InputMismatchException n){
                System.out.println("Only numbers please");
               scanner.nextLine();
            }
        }

        boolean validOperator = false;

        while (!validOperator){
            System.out.print("Enter choice  operator: \"+\" \"-\" \"*\" \"/\" \"%\": ");
            String operator = scanner.next();
            switch (operator){
                   case "+":
                   case "-":
                   case "*":
                   case "/":
                   case "%":
                   calculator.setOperator(operator);
                   validOperator = true;
                   break;
                   default:
                      System.out.println("Wrong operator");
            }
        }

        while (true){
            System.out.print("Enter second number please: ");
            try {
                calculator.setNo2(scanner.nextInt());
                break;
            }catch (InputMismatchException n){
                System.out.println("Only numbers please");
                scanner.nextLine();
            }
        }
        System.out.println("---------------Solution---------------" +
                    "\n "+ calculator.getNo1()+" "+calculator.getOperator()+" "
                         +calculator.getNo2()+" = " +calculator.performCalculation());
    } // main
}




