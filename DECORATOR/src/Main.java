import composant.Boisson;
import composant.Expresso;
import decorators.DChocolat;
import decorators.DLait;

public class Main {
    public static void main(String[] args) {
        Boisson b = new Expresso();
        b = new DChocolat(b);
        b = new DLait(b);
        System.out.println(b.getDescription());
        System.out.println(b.cout());
    }
}