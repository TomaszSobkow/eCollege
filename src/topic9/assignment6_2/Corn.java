package topic9.assignment6_2;

import topic9.assignment6_2.behavior.Boiling20Minutes;

public class Corn extends Vegetable {

    public Corn(String name, String family) {
        super(name, family);
        cooking = new Boiling20Minutes();
    }

    @Override
    public void addAddactives() {
        System.out.println("Add in butter and salt");
    }
}
