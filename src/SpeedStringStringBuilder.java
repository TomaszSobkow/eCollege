import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class SpeedStringStringBuilder {

    static long loops = 130_000;

    public static void main(String[] args) {


        System.out.println("Difference "+ StringBuilderTime()+" second");
        System.out.println("********************");
        System.out.println("Difference "+ StringTime()+" second");
        System.out.println("--------------------------------------");
        double asas= StringTime();
       // System.out.println("------------->\n "+asas);

    }

    static double StringTime ( ){
        String testString = "";
        LocalTime start = LocalTime.now();
        System.out.println("String class TEST\nStart time " + start);
        for(int i = 0; i <loops; i++) testString += "-";
        LocalTime finishTime = LocalTime.now();
        System.out.println("Finish time "+ finishTime+"\nloops number "+ loops);
        return ChronoUnit.MILLIS.between(start,finishTime) * 0.001;
    }

    static double StringBuilderTime(){
        StringBuilder testBuilder = new StringBuilder();
        LocalTime start = LocalTime.now();
        System.out.println("StringBuilder class TEST\nStart time " + start);
        for(int i = 0; i <loops; i++) testBuilder.append("-");
        LocalTime finishTime = LocalTime.now();
        System.out.println("Finish time "+ finishTime+"\nloops number "+loops);
        return ChronoUnit.MILLIS.between(start,finishTime) * 0.001;

    }

}
