package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang, String name) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else {
            return "Hello ".concat(name).concat(" and World!");
        }
    }
}
