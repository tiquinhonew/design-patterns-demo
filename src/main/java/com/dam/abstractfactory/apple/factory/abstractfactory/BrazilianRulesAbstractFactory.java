package com.dam.abstractfactory.apple.factory.abstractfactory;

import com.dam.abstractfactory.apple.model.certificate.BrazilianCertificate;
import com.dam.abstractfactory.apple.model.certificate.Certificate;
import com.dam.abstractfactory.apple.model.packing.BrazilianPacking;
import com.dam.abstractfactory.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {
    @Override
    public Certificate getCertificates() {
        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazilianPacking();
    }
}
