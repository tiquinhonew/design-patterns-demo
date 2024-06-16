package com.dam.structural.adapter.connectport.devices;

import com.dam.structural.adapter.connectport.interfaces.HDMI;

public class TV implements HDMI {

    @Override
    public void setImage(final String image) {
        System.out.printf("🖥️ -> Displaying: %s\n", image);
    }

    @Override
    public void setSound(final String sound) {
        System.out.printf("🔊 -> Playing: %s\n", sound);
    }

    @Override
    public String toString() {
        return "TV";
    }

}
