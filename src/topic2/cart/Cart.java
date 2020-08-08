package topic2.cart;

public class Cart {
    String firstName = "tommmasz";
    public static void main(String[] args) {
//        int noOfCoins = 42;
//        int noOfLivesRemaining =34;
//
//        String proceed_to_next_level_message = (noOfCoins>00) ? (noOfLivesRemaining > 100) ? "Proceed" : "Insufficient coins or lives!Tom" : "Insufficient coins or lives!";
//        System.out.println(proceed_to_next_level_message);

        int  num1 = 2_147_483_647;
        int num2 = 6;
        int num3 = (num1+num2);
        System.out.println(num3);
        char ch1 = 'w';

        System.out.println(num2+""+ch1);

    }



    public  void stringBulding(){
        String custName = "Sully Smith";
        int spaceIndex = custName.indexOf(" ");

        firstName = custName.substring(0,spaceIndex);


        StringBuilder sb = new StringBuilder(firstName);
        System.out.println(sb);
        sb.append(" Sobkow");



    }

    public static void cart1(){
            int numberOfShirt = 0;
            Items item = new Items();
            Items[] items = {new Items(), new Items(), new Items()};
            System.out.println(items.length);
            items[0].desc = "Shirt";
            items[0].itemID = 1234;
            items[1].desc = "pants";
            items[1].itemID = 14567;
            items[2].desc = "shirt";
            items[2].itemID = 5609;

            for (Items i: items){
                System.out.println(i.desc+" "+i.itemID);
                if(i.desc.equalsIgnoreCase("shirt") ){
                    numberOfShirt++;
                }
            }
            System.out.println(numberOfShirt+" shirts in stok");


        }
    }


