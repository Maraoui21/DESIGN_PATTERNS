package composant;

import composant.Boisson;

public class Expresso extends Boisson {
    public Expresso() {
        description = "Expresso";
    }
    @Override
    public Integer cout() {
        return 10;
    }

}
