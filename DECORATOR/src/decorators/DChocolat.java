package decorators;
import composant.Boisson;

public class DChocolat extends Decorateur{
    Boisson boisson;
    public DChocolat(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public Integer cout() {
        return 5+boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" Chocolate";
    }
}
