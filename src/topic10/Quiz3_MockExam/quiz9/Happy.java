package topic10.Quiz3_MockExam.quiz9;

public class Happy {
    int id;
    public Happy(int x){
        this.id = x;
    }

    public static void main(String[] args) {
        Happy h1 = new Happy(1);
        Happy h2 = h1.go(h1);
    }

    public Happy go(Happy h){
        Happy h3 = h;
        h3.id = 2;


        return null;
    }

}
