package topic10;

import topic9.assignment6_4.Radio;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Assignment7_3 {

    static String welcome = "****************** Lucky Number *********************";

    public static void main(String[] args) {

        System.out.println(welcome + "\nPlease enter a number from 0-10 (inclusive)"+
                        "\nThe program will than generate a lucky number"+
                        "\nYou have tree guesses!"+
                        "\nGood luck!!");
        int remaining = 3;

        Random random = new Random();
        int winNumber = random.nextInt(11);

        do {

            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("\nYour guess: ");
                int guess = scanner.nextInt();

                if (guess == winNumber) {
                    System.out.println("You won! The lucky number generated was " + winNumber + " !");
                    break;
                }

                if (guess > 10 || guess < 0) {
                    System.out.println("You must enter a number in the range 0-10 (inc). You entered: " + guess + ". Try again!");
                } else if ((guess != winNumber) && (remaining > 1)) {
                    System.out.println("Wrong! Guesses Remaining: " + --remaining);
                }
            } catch (InputMismatchException e) {
                System.out.println("Error! The number should not be entered as text");

            }
        } while (remaining > 0);
    }
}
