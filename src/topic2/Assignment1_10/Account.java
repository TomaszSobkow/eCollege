package topic2.Assignment1_10;

import java.util.Scanner;

public class Account {
    private String accountNo;
    private String pinNo;
    private String name;
    private  String lastName;
    private float ballance;
    private int iteratror;
    private boolean userFound;
    private int choisenCustomerIndex;


    String loginName;

    Account Julian, Anne, Derek;
    Account[] customersArray = new Account[3];

   private void initialiseCustomers(){
       Julian = new Account("45646432","3435","Julian","King",100);
       Anne = new Account("48593741","8246","Annie","Williams",200);
       Derek = new Account("15432432", "6157","Derek","James",300);

       customersArray[0] = Julian;
       customersArray[1] = Anne;
       customersArray[2] = Derek;
   }

    public Account(){initialiseCustomers();}

    public Account(String accountNo, String pinNo, String name, String lastName, float ballance) {
        this.accountNo = accountNo;
        this.pinNo = pinNo;
        this.name = name;
        this. lastName = lastName;
        this.ballance = ballance;
    }

    public void printAllCustmers(){
        System.out.print("   NAME\t   SURNAME\t ACCOUNT\tPIN\t  BALLANCE\n");
       for(int i =0; i< customersArray.length; i++){
           System.out.print(+ ++iteratror+" "+customersArray[i].getName());
           System.out.print("   "+customersArray[i].getLastName());
           System.out.print("   "+customersArray[i].getAccountNo());
           System.out.print("  "+customersArray[i].getPinNo());
           System.out.print("  "+customersArray[i].getBallance()+"\n");
       }
    }
    Scanner scaner = new Scanner(System.in);

    void checkName(){
        boolean lopp = false;
       while (!lopp) {
           System.out.print("\nPlease enter name: ");
            loginName = scaner.nextLine();

           for(Account account:customersArray){
               if(account.getName().equalsIgnoreCase(loginName)){
                   lopp= true;
                   userFound = true;
                   break;
               }
           }
         if(!userFound){
             System.out.println("User not found !!!!!");
         }
       }// while
    }

public void welcome(){
    System.out.print("*************Welcome******************");
    checkName();
    boolean pinOk = false;
    boolean loop = false;

    while (!loop){
            System.out.print("Please Enter your pin Number: ");
            String pin = scaner.nextLine();
            for (; choisenCustomerIndex <customersArray.length; choisenCustomerIndex++){
                if(customersArray[choisenCustomerIndex].getName().equalsIgnoreCase(loginName) &&
                        customersArray[choisenCustomerIndex].getPinNo().equals(pin)){
                    loop = true;
                    pinOk =true;
                    break;
                }continue;
            }
            if(!pinOk){
                System.out.println("Incorect pin code !!!");
                }
    }//while
}

    public void printCustomer(){
        System.out.print("  NAME\t   SURNAME\t ACCOUNT\tPIN\t  BALLANCE\n"+ ++iteratror+" "+
                getName()+"    "+getLastName()+"\t  "+getAccountNo()+"\t"+getPinNo()+"  "+getBallance());
    }

    public int getChoisenCustomerIndex(){
        return choisenCustomerIndex;
    }

    public String getAccountNo() {
        return accountNo;
    }




    public String getPinNo() {
        return pinNo;
    }



    public String getName() {
        return name;
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getBallance() {
        return ballance;
    }

    public void setBallance(float ballance) {
        this.ballance = ballance;
    }
}



