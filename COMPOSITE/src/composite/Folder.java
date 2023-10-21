package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{
    List<Component> components = new ArrayList<>();
    Folder(String name) {
        super(name);
    }
    public void addChild(Component component){
        components.add(component);
    }
    @Override
    public void print() {
        System.out.println(this.name);
        components.forEach(Component::print);
    }
}
