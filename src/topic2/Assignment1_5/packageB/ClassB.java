package topic2.Assignment1_5.packageB;

public class ClassB {

    private static int noObjCreated;

    public ClassB(){
        noObjCreated++;
    }

    public int getNoObjCreated() {
        return noObjCreated;
    }
}
