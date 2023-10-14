package decorators;

import composant.Boisson;

public abstract class Decorateur extends Boisson {
    protected Boisson boisson;
    public abstract Integer cout();
    public abstract String getDescription();
}
