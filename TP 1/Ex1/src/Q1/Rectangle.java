package Q1;

public class Rectangle extends Figure{
    private Figure figure;
    public Rectangle(Figure figure) {
        this.figure = figure;
    }
    @Override
    public String getShape() {
        return figure.getShape()+" Rectangle";
    }
}
