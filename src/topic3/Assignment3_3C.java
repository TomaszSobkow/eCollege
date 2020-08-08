package topic3;

public class Assignment3_3C {

    public static void main(String[] args) {
        String locale = "Ireland";
        String user = "Java Duke";

        switch (locale){
            case "Ireland":
                System.out.println(user.concat(", Failte!"));
                break;
            case "France":
                System.out.println(user.concat(", Bienvenue!"));
                break;
            case "Germany":
                System.out.println(user.concat(", Willkommenn"));
                break;
            case "Spain":
                System.out.println(user.concat(", Bienvenida!"));
        }

    }
}
