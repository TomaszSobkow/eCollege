package topic2.Assignment1_5.packageA;

public class ClassA {

    private static int noObjCreated;

    public ClassA(){
        noObjCreated++;
    }

    public int getNoObjCreated() {
        return noObjCreated;
    }
}

