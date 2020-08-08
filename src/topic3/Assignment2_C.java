package topic3;

import java.util.Scanner;

public class Assignment2_C {
    public static void main(String[] args) {
        System.out.print("Please enter your Queue number: ");
        Scanner scanner = new Scanner(System.in);

        byte positionInQueue = scanner.nextByte();

        String tickedNo = "12345Z";
    switch (positionInQueue){
        case 1:
        case 2:
        case 3:System.out.println("No. in Queue: "+positionInQueue+ " - please approach the front deck");
        default:
            System.out.println("Please remain your seated");
    }

    }

}
