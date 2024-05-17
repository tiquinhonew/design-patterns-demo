package com.dam.abstractfactory.apple.factory.abstractfactory;

import com.dam.abstractfactory.apple.model.certificate.Certificate;
import com.dam.abstractfactory.apple.model.certificate.USCertificate;
import com.dam.abstractfactory.apple.model.packing.Packing;
import com.dam.abstractfactory.apple.model.packing.USPacking;

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
