package com.dam.structural.adapter.connectport.adapters;

import com.dam.structural.adapter.connectport.devices.OldMonitor;
import com.dam.structural.adapter.connectport.interfaces.HDMI;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

    public HDMIToOldMonitorAdapter() {
        super();
        System.out.println("🔌 -> HDMI to Old Monitor adapter connected: " + this);
    }

    @Override
    public void setImage(final String image) {
        System.out.println("🖼️ -> HDMI to Old Monitor adapter: Image converted to Old Monitor");
        super.setImage(image);
    }

    @Override
    public void setSound(final String sound) {
        System.out.println("🔇 -> Sorry, Old Monitor doesn't support sound!");
    }

    @Override
    public String toString() {
        return "HDMI->OldMonitor - Adapter";
    }

}
