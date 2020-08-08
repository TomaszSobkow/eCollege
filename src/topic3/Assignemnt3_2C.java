package topic3;

public class Assignemnt3_2C {
    public static void main(String[] args) {
        int noLoyalityPointsEarned = 351;
        String description = "Euro off your next shopping bill";

        if(noLoyalityPointsEarned < 150 ){
            System.out.println("No gift");
            }
        else if(noLoyalityPointsEarned >= 151 && noLoyalityPointsEarned <=250){
            System.out.println("25 ".concat(description));
            }
        else if (noLoyalityPointsEarned >=251 && noLoyalityPointsEarned <=350){
            System.out.println("35 ".concat(description));
            }
        else {
            System.out.println("75 ".concat(description));
        }
    }
}
