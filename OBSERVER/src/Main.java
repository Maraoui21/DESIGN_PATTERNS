import implementation.ObservableImpl;
import implementation.ObserverImpl1;
import implementation.ObserverImpl2;

public class Main {
    public static void main(String[] args) {
        ObserverImpl1 obs1 = new ObserverImpl1();
        ObserverImpl2 obs2 = new ObserverImpl2();
        ObservableImpl observable = new ObservableImpl();
        observable.addObserver(obs1);
        observable.addObserver(obs2);
        observable.setState(12);
        // remove obs 1
        observable.removeObserver(obs1);
        observable.setState(15);
        // only obs 2 will receive this update
    }
}