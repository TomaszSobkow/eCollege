package topic10.quizFinal;import java.util.ArrayList;import java.util.Arrays;import java.util.List;public class Question1 {   static String[] justString;    public static void main(String[] args) {    }    static void question4(){        int a = 0;        int b = 10;        for (int c = 0; b > c; b--) { c++;        }        //System.out.print(a + " " + b + " " + c);        }    static void question3(){        String string = "She sells sea shells";        System.out.println(new StringBuilder(string).reverse());        string =  new StringBuilder(string).reverse().toString();        System.out.println("\n---"+string);        String[] araay = new String[5];        Arrays.fill(araay,"tomek");        List e = Arrays.asList(araay);        e.forEach(a-> System.out.println(e));    }    static void question2(){        int x = 3;        int y = 2;        int z = 4;        int total = (x++ + ++x) * (y - z);        System.out.println(total);    }    static void question(){        Question1 num = new Question1( );        Integer[ ] x = new Integer[6];        num.changeNumber(x);        for (int y = 0; y < x.length; y++) {            System.out.print(x[y] + " ");        }    }    public void changeNumber(Integer[ ] x) {        for (int y = 0; y < x.length; y++) {            x[y] = new Integer(y);        }        String tomaszek = "tomaszek";        StringBuilder stringBuilder = new StringBuilder("tomeczek");        System.out.println(stringBuilder.length());        System.out.println(stringBuilder.equals(tomaszek)) ;    }}