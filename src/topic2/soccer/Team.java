package topic2.soccer;



public class Team {

    public String teamName;
    public Player[] playerArray;

    public Team(String teamName){}

     static int x = 6;
    static int y = x;


    public static void terer (){
        System.out.println(x);
        x = 12;
        System.out.println(y);
    }

    public static void main(String[] args) {
        terer();
    }

}
