package com.dam.creational.abstractfactory.factory.abstractfactory;

import com.dam.creational.abstractfactory.model.certificate.Certificate;
import com.dam.creational.abstractfactory.model.certificate.USCertificate;
import com.dam.creational.abstractfactory.model.packing.Packing;
import com.dam.creational.abstractfactory.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {
    @Override
    public Certificate getCertificates() {
        return new USCertificate();
    }

    @Override
    public Packing getPacking() {
        return new USPacking();
    }
}
