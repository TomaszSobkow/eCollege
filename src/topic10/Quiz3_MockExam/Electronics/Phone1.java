package topic10.Quiz3_MockExam.Electronics;

public  class Phone1 extends Electronic implements Device{
     public enum Days{MON, THU,THUSDAY;

     public static void main(String[] args) {

         for (Days d: Days.values());
            Days[] d2 = Days.values();
         System.out.println(d2[2]);

     }

}
}
