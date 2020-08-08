package topic9.assignment6_8;

public class Horse extends Helter{

    @Override
    public String halt() {
        System.out.print(getClass().getSimpleName());
        return ": "+ super.halt()+" ";
    }
}
