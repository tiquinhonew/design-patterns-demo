package com.dam.abstractfactory.factory.abstractfactory;

import com.dam.abstractfactory.model.certificate.Certificate;
import com.dam.abstractfactory.model.packing.Packing;

public interface CountryRulesAbstractFactory {
    Certificate getCertificates();
    Packing getPacking();
}
