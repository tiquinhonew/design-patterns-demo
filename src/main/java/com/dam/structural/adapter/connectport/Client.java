package com.dam.structural.adapter.connectport;

import com.dam.structural.adapter.connectport.adapters.HDMIToOldMonitorAdapter;
import com.dam.structural.adapter.connectport.adapters.HDMIToVGAAdapter;
import com.dam.structural.adapter.connectport.devices.Computer;
import com.dam.structural.adapter.connectport.devices.OldMonitor;
import com.dam.structural.adapter.connectport.devices.TV;

public class Client {

    public static void main(String[] args) {
        // Computer
        Computer computer = new Computer();

        // TV with HDMI port
        // Computer connected to TV
        TV tv = new TV();
        computer.connectPort(tv);
        computer.sendImageAndSound("Cat and rainbow", "Nyan cat song");
        System.out.println("-------------------------------------");

        // VGA monitor
        OldMonitor monitor = new OldMonitor();
        HDMIToVGAAdapter hdmiToVGAAdapter = new HDMIToVGAAdapter(monitor);
        computer.connectPort(hdmiToVGAAdapter);
        computer.sendImageAndSound("Dog and rainbow", "Bark bark song");
        System.out.println("-------------------------------------");

        // VGA monitor - Class Adapter
        HDMIToOldMonitorAdapter hdmiToOldMonitorAdapter = new HDMIToOldMonitorAdapter();
        computer.connectPort(hdmiToOldMonitorAdapter);
        computer.sendImageAndSound("Mouse and rainbow", "Squeak squeak song");
        System.out.println("-------------------------------------");
    }

}
