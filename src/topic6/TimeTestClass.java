package topic6;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import javax.swing.JOptionPane;
import java.time.*;

public class TimeTestClass {
	
	private static String user;
	private static String password;
	private static BufferedWriter writeTouserFile;
	private static BufferedWriter writeToPasswordFile;
	private static BufferedWriter writeToTimeFile;
	private static Scanner readUsersFile;
	private static Scanner readPasswordFile;
	private static Scanner readTimeFile;
	private static List<String> usersInArray;
	private static List<String> passwordsInArray ;
	private static List<LocalDateTime> timeUserCreatedInArray;
	
	
	public static void saveToUsersFile(String user)throws IOException{
		getWriteTouserFile().write(user);
		getWriteTouserFile().close();
	}
	
	public static void saveToTimeCreatedUsersFile(String time) throws IOException{
		getWriteToTimeFile().write(time);
		getWriteToTimeFile().close();
	}
	
	public static void saveToPasswordFile(String password) throws IOException{
		getWriteToPasswordFile().write(password);
		getWriteToPasswordFile().close();
	
	}
	
	

	public static void main(String[] args) throws IOException {
		
		String iniData = ";LAMLKSNDWEOITU109TUJ34PTV55Y78967DF2435T0X2I9NVU]PBEKey";
		
		List<Object> timeUserCreatedInArray = new ArrayList<>(50);
		List<String> usersInArray = new ArrayList<>(50);
		List<String> passwordsInArray = new ArrayList<>(50);
		
		
		File timeCreatedUsers = new File("TimeCreatedUsers.txt");
		File usersFile = new File("Users.txt");
		File passwordsFile = new File("Passwords.txt");
		
		
		FileWriter createwriteToTimeCreatedUser = new FileWriter(timeCreatedUsers,true);
		FileWriter createUserFile = new FileWriter(usersFile,true);
		FileWriter createPasswordFile = new FileWriter(passwordsFile,true); 
		
		setWriteToTimeFile(new BufferedWriter(createwriteToTimeCreatedUser));
		setWriteTouserFile(new BufferedWriter(createUserFile));
		setWriteToPasswordFile(new BufferedWriter(createPasswordFile));
			
		
		setReadTimeFile(new Scanner(timeCreatedUsers));
		while(getReadTimeFile().hasNext()){
			timeUserCreatedInArray.add(getReadTimeFile().next());
		}
		
		setReadUsersFile(new Scanner(usersFile));
		while(getReadUsersFile().hasNext()){
			usersInArray.add(getReadUsersFile().next());
		}
		
		setReadPasswordFile(new Scanner(passwordsFile));
		while(getReadPasswordFile().hasNext()){
			passwordsInArray.add(getReadPasswordFile().next());
		}
		
		if(timeUserCreatedInArray.isEmpty()){
				timeUserCreatedInArray.add(iniData);
			}
			
			if(usersInArray.isEmpty()){
				usersInArray.add(iniData);
			}
			
			if(passwordsInArray.isEmpty()){
				passwordsInArray.add(iniData);
			}
		

		boolean isUser = false;
		while(!isUser){
			setUser(JOptionPane.showInputDialog("Please enter user name: "));
			if(getUser().equals("")){
				JOptionPane.showMessageDialog(null,"User name can't be empty ");
			}
			else{
				
				for(int i = 0; i < usersInArray.size(); i++){
					if(usersInArray.get(i).equalsIgnoreCase(getUser())){
						JOptionPane.showMessageDialog(null," Users \""+ getUser() + "\" arledy exist!","Wrong user Name",JOptionPane.ERROR_MESSAGE);
						 
					}else{
						int input = JOptionPane.showConfirmDialog(null,"User "+ getUser() +" \nDoesn' exist \nDo you want to create new user with nick name\t\n\""+ getUser() +"\"","",JOptionPane.YES_NO_OPTION);
						if(usersInArray.get(0) == iniData){
							usersInArray.clear();
						}
						
						 if(passwordsInArray.get(0) == iniData){
							passwordsInArray.remove(iniData);
						}
						
						 if(timeUserCreatedInArray.get(0) == iniData){
							timeUserCreatedInArray.clear();
						}
						if (input == 0){
							
							boolean isPassword = false;
							while(!isPassword){
								setPassword(JOptionPane.showInputDialog("Please enter password for \""+ getUser() +"\" user"));
									if(getPassword().equals("")){
										JOptionPane.showMessageDialog(null,"User password can't be empty ");
									}else{
										isPassword = true;
									}
								
							}
							
							int sepDay = LocalDateTime.now().toString().indexOf("T");
							int sepHour = LocalDateTime.now().toString().indexOf(".");
							String day = LocalDateTime.now().toString().substring(0,sepDay);
							String time = LocalDateTime.now().toString().substring(sepDay+1,sepHour);
							
							
							usersInArray.add(getUser() +" ");
							passwordsInArray.add(getPassword());
							timeUserCreatedInArray.add(day+" "+time);
							 						
							saveToUsersFile(getUser() +" ");
							saveToPasswordFile(getPassword() +" ");
							saveToTimeCreatedUsersFile(day+" "+time+" ");
						}
						
						  if(input == 1){
							isUser = true;	
							break;
						}
						isUser = true;	
						JOptionPane.showMessageDialog(null,"New User \""+ getUser() + "\" has ben created ","",JOptionPane.PLAIN_MESSAGE);
					}break;
				}			
			}
		}
		
	  for(int i = 0; i < usersInArray.size(); i++){
			System.out.printf("%-4s %-15s %-10s",(i+1)+":" , "\nUser Name:", usersInArray.get(i)+"\n");
			System.out.printf("%-15s %-10s", "Password: ", passwordsInArray.get(i)+"\n");
			System.out.printf("%-15s %-10s", "Date: ", timeUserCreatedInArray.get(i)+"\n");
			
		}
	}

	public static String getUser() {
		return user;
	}

	public static void setUser(String user) {
		TimeTestClass.user = user;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		TimeTestClass.password = password;
	}

	public static BufferedWriter getWriteTouserFile() {
		return writeTouserFile;
	}

	public static void setWriteTouserFile(BufferedWriter writeTouserFile) {
		TimeTestClass.writeTouserFile = writeTouserFile;
	}

	public static BufferedWriter getWriteToPasswordFile() {
		return writeToPasswordFile;
	}

	public static void setWriteToPasswordFile(BufferedWriter writeToPasswordFile) {
		TimeTestClass.writeToPasswordFile = writeToPasswordFile;
	}

	public static BufferedWriter getWriteToTimeFile() {
		return writeToTimeFile;
	}

	public static void setWriteToTimeFile(BufferedWriter writeToTimeFile) {
		TimeTestClass.writeToTimeFile = writeToTimeFile;
	}

	public static Scanner getReadUsersFile() {
		return readUsersFile;
	}

	public static void setReadUsersFile(Scanner readUsersFile) {
		TimeTestClass.readUsersFile = readUsersFile;
	}

	public static Scanner getReadPasswordFile() {
		return readPasswordFile;
	}

	public static void setReadPasswordFile(Scanner readPasswordFile) {
		TimeTestClass.readPasswordFile = readPasswordFile;
	}

	public static Scanner getReadTimeFile() {
		return readTimeFile;
	}

	public static void setReadTimeFile(Scanner readTimeFile) {
		TimeTestClass.readTimeFile = readTimeFile;
	}

	public static List<String> getUsersInArray() {
		return usersInArray;
	}

	public static void setUsersInArray(List<String> usersInArray) {
		TimeTestClass.usersInArray = usersInArray;
	}

	public static List<String> getPasswordsInArray() {
		return passwordsInArray;
	}

	public static void setPasswordsInArray(List<String> passwordsInArray) {
		TimeTestClass.passwordsInArray = passwordsInArray;
	}

	public static List<LocalDateTime> getTimeUserCreatedInArray() {
		return timeUserCreatedInArray;
	}

	public static void setTimeUserCreatedInArray(List<LocalDateTime> timeUserCreatedInArray) {
		TimeTestClass.timeUserCreatedInArray = timeUserCreatedInArray;
	}
}




