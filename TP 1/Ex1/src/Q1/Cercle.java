package Q1;

public class Cercle extends Figure{
    private Figure figure;
    public Cercle(Figure figure) {
        this.figure = figure;
    }
    @Override
    public String getShape() {
        return figure.getShape()+" Cercle";
    }
}
