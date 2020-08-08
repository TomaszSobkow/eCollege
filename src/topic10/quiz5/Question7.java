package topic10.quiz5;

public class Question7 {

    Question7(){
        System.out.println("In default constructor ");
    }

    public static void main(String[] args) {
        int[][] ba = new int[4][6];  //{{2,3,4,5,6},{12,34,56,78,89,89,89},{90,91,92,93}};
        for (int i = 0; i < ba.length; i++){
                for(int b =0; b < ba[i].length; b++){
                    System.out.print(ba[i][b]+",");
                }
            System.out.println();
        }
        System.out.println(ba.length);
    }
}
