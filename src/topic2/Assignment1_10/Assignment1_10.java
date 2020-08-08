package topic2.Assignment1_10;

public class Assignment1_10 {
    public static void main(String[] args) {
        Account atm = new Account();
        atm.welcome();
        System.out.println("\n");
        atm.customersArray[atm.getChoisenCustomerIndex()].printCustomer();


    }
}
