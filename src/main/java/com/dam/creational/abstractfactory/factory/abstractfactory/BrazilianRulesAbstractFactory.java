package com.dam.creational.abstractfactory.factory.abstractfactory;

import com.dam.creational.abstractfactory.model.certificate.BrazilianCertificate;
import com.dam.creational.abstractfactory.model.certificate.Certificate;
import com.dam.creational.abstractfactory.model.packing.BrazilianPacking;
import com.dam.creational.abstractfactory.model.packing.Packing;

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
