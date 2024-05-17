package com.dam.abstractfactory.factory.abstractfactory;

import com.dam.abstractfactory.model.certificate.BrazilianCertificate;
import com.dam.abstractfactory.model.certificate.Certificate;
import com.dam.abstractfactory.model.packing.BrazilianPacking;
import com.dam.abstractfactory.model.packing.Packing;

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
