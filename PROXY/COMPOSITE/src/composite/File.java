package composite;

public class File extends Component{
    File(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(this.name);
    }
}
