package com.dam.creational.abstractfactory;

import com.dam.creational.abstractfactory.factory.IPhone11Factory;
import com.dam.creational.abstractfactory.factory.IPhoneFactory;
import com.dam.creational.abstractfactory.factory.IPhoneXFactory;
import com.dam.creational.abstractfactory.factory.abstractfactory.CountryRulesAbstractFactory;
import com.dam.creational.abstractfactory.factory.abstractfactory.USRulesAbstractFactory;
import com.dam.creational.abstractfactory.model.iphone.IPhone;

public class Client {

    public static void main(String[] args) {
//        CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
        CountryRulesAbstractFactory rules = new USRulesAbstractFactory();
        IPhoneFactory genXFactory = new IPhoneXFactory(rules);
        IPhoneFactory gen11Factory = new IPhone11Factory(rules);

        System.out.println("### Ordering an iPhone X");
        IPhone iphone = genXFactory.orderIPhone("standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
        System.out.println(iphone2);
    }
}
