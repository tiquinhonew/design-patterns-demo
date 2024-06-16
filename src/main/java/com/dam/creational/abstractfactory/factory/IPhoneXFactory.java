package com.dam.creational.abstractfactory.factory;

import com.dam.creational.abstractfactory.factory.abstractfactory.CountryRulesAbstractFactory;
import com.dam.creational.abstractfactory.model.iphone.IPhone;
import com.dam.creational.abstractfactory.model.iphone.IPhoneX;
import com.dam.creational.abstractfactory.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    public IPhoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    public IPhone createIPhone(String level) {
        if(level.equals("standard")) {
            return new IPhoneX(rules);
        } else if(level.equals("highEnd")) {
            return new IPhoneXSMax(rules);
        } else return null;
    }
}
