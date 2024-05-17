package com.dam.abstractfactory.apple.model.certificate;

public class BrazilianCertificate implements Certificate {
    @Override
    public String applyCertification() {
        return "\t- Calibrating Brazilian rules\n\t- Applying Anatel's Stamp";
    }
}
