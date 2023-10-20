package implementation;
import interfaces.Observable;
import interfaces.Observer;
import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    List<Observer> observers = new ArrayList<>();
    Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
        this.notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(obs->{
            obs.update(this);
        });
    }
}
