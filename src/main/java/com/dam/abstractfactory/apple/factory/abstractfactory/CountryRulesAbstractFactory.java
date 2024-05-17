package com.dam.abstractfactory.apple.factory.abstractfactory;

import com.dam.abstractfactory.apple.model.certificate.Certificate;
import com.dam.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
    Certificate getCertificates();
    Packing getPacking();
}
