package com.dam.creational.abstractfactory.factory;

import com.dam.creational.abstractfactory.factory.abstractfactory.CountryRulesAbstractFactory;
import com.dam.creational.abstractfactory.model.iphone.IPhone;
import com.dam.creational.abstractfactory.model.iphone.IPhone11;
import com.dam.creational.abstractfactory.model.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    public IPhone11Factory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    public IPhone createIPhone(String level) {
        if(level.equals("standard")) {
            return new IPhone11(rules);
        } else if(level.equals("highEnd")) {
            return new IPhone11Pro(rules);
        } else return null;
    }

}
