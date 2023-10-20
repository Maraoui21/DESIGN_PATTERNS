import implementations.SImpl1;
import implementations.SImpl2;

public class Main {
    public static void main(String[] args) {

        // using implementation 1 for our context
        SImpl1 sI1 = new SImpl1();
        Context context = new Context(sI1);
        context.show();
        // switching to the second implementation
        context.setStrategy(new SImpl2());
        context.show();
    }
}