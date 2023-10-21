import Proxy.*;
public class Main {
    public static void main(String[] args) {
        Context c1 = new Context();
        SecurityContext.setContext("USER","AHMED KARIM");
        c1.setiService(new Proxy());
        c1.compute();
    }
}