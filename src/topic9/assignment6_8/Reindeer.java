package topic9.assignment6_8;

public class Reindeer extends Helter {

    @Override
    public String halt() {
        System.out.print(getClass().getSimpleName());
        return ": "+ super.halt()+" ";
    }
}
