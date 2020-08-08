package topic3;

public class Assignment3_7A {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            for (int y = 0; y < 10; y++) {
                if(i == 5)
                    continue;
                System.out.print(i + "-" + y + " ");

            }
            System.out.println();
        }
    }
}
