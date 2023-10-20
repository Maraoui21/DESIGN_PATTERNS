package implementation;

import interfaces.Observable;
import interfaces.Observer;

public class ObserverImpl1 implements Observer {
    Integer state;
    @Override
    public void update(Observable o) {
        this.state = ((ObservableImpl) o).getState();
        System.out.println("OBS 1 STATE IS UPDATED WITH VALUE ===> "+state);
    }
}
