package computer;

public class CentralUnite {
    private VGA vga;
    public void print(){
        System.out.println("=====VGA=====");
        vga.print();
        System.out.println("=============");
    }
    public CentralUnite(VGA vga) {
        this.vga = vga;
    }
}
