package topic3;



public class Assignemt3_5A {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        int i = 0;
        while (i < 10){
            myArray[i] = i+1;
            System.out.print((i+1)+" ");
            i++;
        }
        System.out.print("\nmyArray ");
        for (int a:myArray)
            System.out.print(a+" ");

    }
}
