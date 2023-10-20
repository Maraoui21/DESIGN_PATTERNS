import implementations.Strategy;

public class Context {
    Strategy strategy;
    public void show(){
        strategy.show();
    }
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    Context(Strategy strategy){
        this.strategy = strategy;
    }
}
