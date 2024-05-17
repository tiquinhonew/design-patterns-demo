package com.dam.abstractfactory.apple.model.packing;

public class BrazilianPacking implements Packing {
    @Override
    public String pack() {
        return "\t- Packing in Portuguese box";
    }
}
