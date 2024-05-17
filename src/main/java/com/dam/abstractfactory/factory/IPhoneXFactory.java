package com.dam.abstractfactory.factory;

import com.dam.abstractfactory.factory.abstractfactory.CountryRulesAbstractFactory;
import com.dam.abstractfactory.model.iphone.IPhone;
import com.dam.abstractfactory.model.iphone.IPhoneX;
import com.dam.abstractfactory.model.iphone.IPhoneXSMax;

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
