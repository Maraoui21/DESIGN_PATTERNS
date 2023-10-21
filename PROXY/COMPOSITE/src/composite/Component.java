package composite;

public abstract class Component {
    protected String name;
    public abstract void print();
    Component(String name){
        this.name=name;
    }
}
