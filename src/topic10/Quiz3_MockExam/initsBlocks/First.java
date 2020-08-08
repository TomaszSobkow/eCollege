package topic10.Quiz3_MockExam.initsBlocks;

public class First extends Second{
    {
        System.out.println("Init block in First Class");
    }


    public static void main(String[] args) {
        new Thirth();
    }
}
