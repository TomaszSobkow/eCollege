package topic3;

public class Assignment3_4B {
    public static void main(String[] args) {
        for (int i = 0, y = 10; i < 10; i++, y--){
            System.out.println("Going up: "+ i + "- Going down: "+y);
            if(i == y){
                break;
            }
        }
    }
}


