package topic3;

public class Assignemt3_5C {
    public static void main(String[] args) {

        int x =0, y = 10;
        do {
            System.out.println("Going Up: "+ x +" - Going Down: "+ y);
            if(x == y)
                break;
            x++;
            y--;
        }while (x<10);
    }
}
