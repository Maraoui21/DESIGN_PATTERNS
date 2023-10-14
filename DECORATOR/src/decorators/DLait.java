package decorators;

import composant.Boisson;

public class DLait extends Decorateur{
    Boisson boisson;
    public DLait(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public Integer cout() {
        return 7+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Lait";
    }
}
