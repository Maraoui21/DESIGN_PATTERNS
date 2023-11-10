package Q1;

import Q1.Cercle;
import Q1.Figure;
import Q1.Rectangle;

public class Main {
    public static void main(String[] args) {
        Figure f = new Figure();
        f = new Rectangle(f);
        f = new Cercle(f);
        f=new Rectangle(f);
        f=new Rectangle(f);
        f=new Rectangle(f);
        f=new Cercle(f);
        System.out.println(f.getShape());
    }
}