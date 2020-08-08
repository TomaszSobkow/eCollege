package topic10.quiz5;

public class Question2 {
    public static void main(String[] args) {
        String[] hordes = {"tom","aga",null};
        System.out.println(hordes.length);
        System.out.println(hordes[2]);
        hordes[2] = "tom Again";
        System.out.println(hordes[2]);
        char[] chars = new char[2];
        chars[0] = 0x4e;

        System.out.println(chars[0]+ "----"+ 0x4e);


    }
}
