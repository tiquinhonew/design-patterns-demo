package com.dam.structural.adapter.connectport.devices;

import com.dam.structural.adapter.connectport.interfaces.VGA;

public class OldMonitor implements VGA {

    @Override
    public void setImage(final String image) {
        System.out.printf("🖥️ -> Displaying: %s\n", image);
    }

    @Override
    public String toString() {
        return "OldMonitor";
    }

}
