package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.kontakty.Absolvent;
import sk.stuba.fei.uim.oop.kontakty.Kontakt;
import sk.stuba.fei.uim.oop.zvierata.Macka;
import sk.stuba.fei.uim.oop.zvierata.Pes;
import sk.stuba.fei.uim.oop.zvierata.Zviera;

public class Main {
    public static void main(String[] args) {
        var dunco = new Pes("dunco");
        var garfield = new Macka("Garfield");

        dunco.pohladkat();
        garfield.pohladkat();
    }
}