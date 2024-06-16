package com.dam.creational.abstractfactory.factory.abstractfactory;

import com.dam.creational.abstractfactory.model.certificate.Certificate;
import com.dam.creational.abstractfactory.model.packing.Packing;

public interface CountryRulesAbstractFactory {
    Certificate getCertificates();
    Packing getPacking();
}
