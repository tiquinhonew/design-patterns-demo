package com.dam.creational.abstractfactory.model.iphone;

import com.dam.creational.abstractfactory.factory.abstractfactory.CountryRulesAbstractFactory;

public class IPhoneX extends IPhone {

    public IPhoneX(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("Hardware list");
        System.out.println("\t- 5.8in Screen");
        System.out.println("\t- A11 Chipset");
        System.out.println("\t- 3Gb RAM");
        System.out.println("\t- 256Gb Memory");
    }
}
