package topic9.assignment6_2;

import topic9.assignment6_2.behavior.Boiling20Minutes;

public class Carrot extends Vegetable {

    @Override
    public void addAddactives() {

    }

    public Carrot(String name, String family) {
        super(name, family);
        cooking = new Boiling20Minutes();


    }


}
