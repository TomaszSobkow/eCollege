package topic10.Quiz3_MockExam.quiz5;

public class Fizz {
    int x = 5;

    public static void main(String[] args) {
        final Fizz f1 = new Fizz();
        Fizz f2 = new Fizz();
        Fizz f3 = FizzSwith(f1, f2);
        System.out.println((f1 == f3) + "----" + (f1.x == f3.x));

    }

    static Fizz FizzSwith(Fizz x, Fizz y){
        final Fizz z = x;
        z.x = 6;
        return z;
    }
}
