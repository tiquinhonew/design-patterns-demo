package com.dam.abstractfactory.model.packing;

public class BrazilianPacking implements Packing {
    @Override
    public String pack() {
        return "\t- Packing in Portuguese box";
    }
}
