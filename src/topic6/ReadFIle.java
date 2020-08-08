package topic6;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFIle {

    static String user;

    public static void seveToPasswordFile(String user){
    }

    public static void main(String[] args) throws IOException {

        File passwordsFile = new File("Passwords.txt");
        File usersFile = new File("Users.txt");

        FileWriter createUserFile = new FileWriter(usersFile,true);
        BufferedWriter writeTouserFile = new BufferedWriter(createUserFile);

        ArrayList<String> usersInArray = new ArrayList<>(50);

        Scanner readUsersFile = new Scanner(usersFile);
        while(readUsersFile.hasNext()){
            usersInArray.add(readUsersFile.next());
        }

//        boolean isUser = false;
//        while(!isUser){
//            user = JOptionPane.showInputDialog("Please enter user name: ");
//            if(user.equals("")){
//                JOptionPane.showMessageDialog(null,"User name can't be empty ");
//            }
//            else{
//                System.out.println("In else !!!!");
//                for(int i = 0; i < usersInArray.size(); i++) {
//                    if (usersInArray.get(i).equalsIgnoreCase(user)) {
//                        JOptionPane.showMessageDialog(null, " Users \"" + user + "\" arledy exist!");
//                        break;
//                    } else {
//                        System.out.println("New User");
//                        isUser = true;
//
//                    }
//                }System.out.println("End for loop");
//            }
//        }
        for(String a: usersInArray){
            System.out.println(usersInArray.size()+" --" +a+ " ");
        }

        // out.println("Time is now: "+LocalTime.now()+ "\nTime plus 2 hours and 15 minuts is: "+LocalTime.now().plusHours(2).plusMinutes(15)+
        // "\nTime only with  hours and minutes only: "+ LocalTime.now().truncatedTo(MINUTES)+
        // "\n\nTime only with seconds only:" + LocalTime.now().toSecondOfDay()/60+
        // "\nLocalTime.of "+ LocalTime.of(0,33)+
        // "\nIs now after-> "+LocalTime.of(0,39).isAfter(LocalTime.now())+
        // "\n How many minuts to 1:00--> " + LocalTime.now().until(LocalTime.of(1,0),MINUTES));
    }
}
