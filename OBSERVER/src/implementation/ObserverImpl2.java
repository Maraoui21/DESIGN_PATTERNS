package implementation;

import interfaces.Observable;
import interfaces.Observer;

public class ObserverImpl2 implements Observer {
    Integer state;
    @Override
    public void update(Observable o) {
        this.state = ((ObservableImpl) o).getState();
        System.out.println("OBS 2 STATE IS UPDATED WITH VALUE ===> "+state);
    }
}
