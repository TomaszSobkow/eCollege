package topic10;

import topic10.Quiz7.QuestionsTimeDate;

public class Assignment7_2 extends QuestionsTimeDate {


    public static void main(String[] args) {

        QuestionsTimeDate.question2();

        try {
            for (String arg : args) {
                if (Integer.parseInt(arg) >= 65) {
                    System.out.println("Your age is " + arg + "\nYour qualify for a free bus pass");
                } else {
                    System.out.println("Your age is " + arg + "\nYou are to young to qualify for a free bus pass");
                }
            }
        }catch (ArrayIndexOutOfBoundsException i){
            System.out.println("\nPlease add ony number of age when program starts");
        }catch (NumberFormatException n){
            System.out.println("Please enter only numbers !!! idiot!!!");
        }

    }
}
