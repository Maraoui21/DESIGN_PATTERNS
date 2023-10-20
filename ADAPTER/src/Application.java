import TV.TV;
import adapter.VgaHdmiAdapter;
import computer.CentralUnite;
import computer.Screen;

public class Application {
    public static void main(String[] args) {
        // without adapter
        Screen vgaScreen = new Screen();
        CentralUnite cu1 = new CentralUnite(vgaScreen);
        cu1.print();

        // using adapter pattern
        TV hdmiScreen = new TV();
        // convert hdmi to vga
        VgaHdmiAdapter vgaHdmiAdapter = new VgaHdmiAdapter(hdmiScreen);
        CentralUnite cu2 = new CentralUnite(vgaHdmiAdapter);
        cu2.print();


    }
}