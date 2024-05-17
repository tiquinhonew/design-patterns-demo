package com.dam.abstractfactory.apple.model.certificate;

public class USCertificate implements Certificate {
    @Override
    public String applyCertification() {
        return "\t- Calibrating US rules";
    }
}
