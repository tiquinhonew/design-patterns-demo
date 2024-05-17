package com.dam.abstractfactory.apple.model.packing;

public class USPacking implements Packing {
    @Override
    public String pack() {
        return "Packing in English box";
    }
}
