package topic9.assignment6_2;

import topic9.assignment6_2.behavior.Boiling20Minutes;

public class Pea extends Vegetable {
    public Pea(String name, String family) {
        super(name, family);
        cooking = new Boiling20Minutes();
    }

    @Override
    public void addAddactives() {

    }
}
