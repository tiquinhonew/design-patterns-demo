package com.dam.structural.adapter.connectport.devices;

import com.dam.structural.adapter.connectport.interfaces.HDMI;

public class Computer {

    private HDMI port;

    public void connectPort(HDMI screen) {
        System.out.printf("🔌 -> Connected to %s\n", screen.toString());
        this.port = screen;
    }

    public void sendImageAndSound(String image, String sound) {
        if (port != null) {
            port.setImage(image);
            port.setSound(sound);
        } else {
            System.out.println("🔌 -> Connect a HDMI cable first!");
        }
    }

}
