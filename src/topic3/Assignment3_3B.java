package topic3;



public class Assignment3_3B {
    enum steakooked {RARE, MEDIUM_RARE, MEDIUM, WELL_DONE}

    public static void main(String[] args) {
        steakooked steaks= steakooked.RARE;

        switch (steaks){
            case RARE:{
                System.out.println("Steak served with a cool red centre.");
                break;
            }
            case MEDIUM:{
                System.out.println("Your steak will be served with a hot red centre.");
                break;
            }
            case WELL_DONE:{
                System.out.println("Brown and well cooked throughout.");
                break;
            }
            case MEDIUM_RARE:{
                System.out.println("Pink throughout.");
                break;
            }
        }


    }
}
