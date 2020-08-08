package topic3;

public class Assignment3_4A {
    public static void main(String[] args) {

        byte[] myArray = new byte[10];
        for (byte i = 0; i<myArray.length; i++) {
            myArray[i] = (byte) (i + 1);
        }
        for (int a:myArray){
            System.out.print(a+" ");
        }
    }
}
