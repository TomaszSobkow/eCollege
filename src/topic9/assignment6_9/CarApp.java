package topic9.assignment6_9;

public class CarApp {

    public static void main(String[] args) {

        Twizy renault = new Twizy("Renault","Twizy","ONA1234G",2019);
        Yaris toyota = new Yaris("Toyota","Yaris","D23TRs",2018);


        System.out.println(toyota);
        System.out.println(renault);
        System.out.println(new NoTechInfoCar());
    }
}
