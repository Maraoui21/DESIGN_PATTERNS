package adapter;

import TV.HDMI;
import computer.VGA;

public class VgaHdmiAdapter implements VGA {
    private HDMI hdmi;

    public VgaHdmiAdapter(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    @Override
    public void print() {
        hdmi.print();
    }
}
