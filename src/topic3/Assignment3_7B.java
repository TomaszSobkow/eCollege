package topic3;

public class Assignment3_7B {
    public static void main(String[] args) {
        int i=0;
        int j=0;
    char a = 'a';
    char b = a++;
        System.out.println("--- to a "+a);

        while(i<10){
            while(j<10){
                if(i==5){
                    break;
                }
                System.out.print(i + "-" + j++ + " ");
            }// inner loop

            j=0;
            i++;
            System.out.println();
        }// outer loop

    }
    }

