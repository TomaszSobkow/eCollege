package topic10.Quiz7;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.time.*;

import java.time.format.DateTimeFormatter;

public class QuestionsTimeDate {
     static Period between;
     static LocalDate aDate = null;
     static boolean validStr = false;

     static DateTimeFormatter forrmater = DateTimeFormatter.ofPattern("dd MM yyyy");
     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        question1();
        }



   protected static void question2(){
        try {
            String dateEntered =  JOptionPane.showInputDialog(null,"Enter date please"+
                    "\n FORMAT DD MM YYYY");// br.readLine();
            aDate = LocalDate.parse(dateEntered,forrmater);

        }catch ( DateTimeException ex){
            System.out.println("a date"+ aDate);
        }
        System.out.println(LocalDate.now());

        //Calculate the years, month and days between now and data entered
        if(aDate.isBefore(LocalDate.now())){
            between = Period.between(aDate, LocalDate.now());
        }else {
            between = Period.between(LocalDate.now(),aDate);
        }
        int years = between.getYears();
        int month = between.getMonths();
        int day = between.getDays();
        JOptionPane.showMessageDialog(null,"Date entered was "+ aDate+" "+aDate.getDayOfWeek()+
                "\nToday is: "+ LocalDate.now()+" "+LocalDate.now().getDayOfWeek()+
                "\nThere are \nYears "+ years+
                "\nMonths "+month+
                "\nDays "+day);
    }

    static void question3(){
        System.out.println(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
        LocalDate id = LocalDate.of(1940, Month.JANUARY,3);
        id = id.minusYears(3).plusMonths(10).plusDays(15);
        //id.minusYears(10); // is redundant because Strings are immutable
        System.out.println(id.getYear()+"- "+ id.getMonth());
    }

    static void question4(){
        String date1 = "2011-12-03";
        DateTimeFormatter forrmater1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateNow = LocalDate.parse(date1,forrmater1);
        System.out.println(dateNow);

        String date2 = "2011-12-03T00:00:00";
        DateTimeFormatter forrmater2 = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime dateNext = LocalDateTime.parse(date2,forrmater2);
        System.out.println(dateNext.toString().replace('T',' '));
    }

    protected static void question6(){
        LocalDateTime currentDataTime = LocalDateTime.now();
        LocalTime meetingTime = LocalTime.of(16,0);
        if(meetingTime.isBefore(currentDataTime.toLocalTime())){
            System.out.println("You are late!");
        }else {
            System.out.println("There is a meeting later today");
            //Period p = Period.between(currentDataTime.toLocalTime(),meetingTime);
        }
    }
    static void question1(){
        Period p = Period.parse("P1Y1M1D");
        System.out.println(p.getYears()+"-"+p.getMonths()+"-"+p.getDays());
        System.out.println(LocalDate.now().plusMonths(1));
    }
}
