package topic9.assignment6_2.behavior;

import topic9.assignment6_2.interfaces.Cooking;

public class Boiling20Minutes  implements Cooking {
    @Override
    public void cooking() {
        System.out.println("To Cook: Add to boiling water and leave to simmer for 20 minutes.");
    }
}
