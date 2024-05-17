package com.dam.abstractfactory.factory.abstractfactory;

import com.dam.abstractfactory.model.certificate.Certificate;
import com.dam.abstractfactory.model.certificate.USCertificate;
import com.dam.abstractfactory.model.packing.Packing;
import com.dam.abstractfactory.model.packing.USPacking;

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
