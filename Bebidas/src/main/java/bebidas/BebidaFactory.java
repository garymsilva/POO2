package main.java.bebidas;

import main.java.bebidas.Cafe;
import main.java.bebidas.Cha;
import main.java.bebidas.Refrigerante;
import main.java.bebidas.Suco;

/**
 * BebidaFactory
 */
public class BebidaFactory {

    public Bebida createBebida(String tipoBebida) {
        if(tipoBebida.equalsIgnoreCase("suco")) return new Suco();
        if(tipoBebida.equalsIgnoreCase("cafe")) return new Cafe();
        if(tipoBebida.equalsIgnoreCase("cha")) return new Cha();
        if(tipoBebida.equalsIgnoreCase("refrigerante")) return new Refrigerante();
        return null;
    }
}