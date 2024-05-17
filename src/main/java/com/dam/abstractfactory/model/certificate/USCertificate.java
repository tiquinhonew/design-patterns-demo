package com.dam.abstractfactory.model.certificate;

public class USCertificate implements Certificate {
    @Override
    public String applyCertification() {
        return "\t- Calibrating US rules";
    }
}
