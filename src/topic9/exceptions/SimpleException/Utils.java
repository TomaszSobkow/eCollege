package topic9.exceptions.SimpleException;

public  class Utils{

    public  void toThis(){
        try {
            doThat();

        }catch (Exception e){
            System.out.println("Exception in toThis "+ e);
        }
    }

    public void doThat() throws Exception{
        System.out.println("In method doThat");
       // throw new  Exception();
    }
}

