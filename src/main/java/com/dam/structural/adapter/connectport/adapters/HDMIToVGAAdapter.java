package com.dam.structural.adapter.connectport.adapters;

import com.dam.structural.adapter.connectport.interfaces.HDMI;
import com.dam.structural.adapter.connectport.interfaces.VGA;

public class HDMIToVGAAdapter implements HDMI {

    private final VGA vga;

    public HDMIToVGAAdapter(VGA vga) {
        System.out.println("🔌 -> HDMI to VGA adapter connected: " + vga);
        this.vga = vga;
    }

    @Override
    public void setImage(final String image) {
        System.out.println("🖼️ -> HDMI to VGA adapter: Image converted to VGA");
    }

    @Override
    public void setSound(final String sound) {
        System.out.println("🔇 -> Sorry, VGA doesn't support sound!");
    }

    @Override
    public String toString() {
        return "HDMI->VGA - Adapter{" +
            "vga=" + vga +
            '}';
    }

}
