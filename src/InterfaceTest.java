// Datei: src/InterfaceTest.java
public class InterfaceTest {
    public static boolean transportMachbar(Transportierbar tDetails) {
        float gewicht = tDetails.gewicht();
        float laenge = tDetails.laenge();
        float breite = tDetails.breite();

        float gewichtProFlaeche = gewicht / (laenge * breite);

        return gewichtProFlaeche < Transportierbar.MAX_GEWICHT_PRO_FLAECHE;
    }

    public static float berechneVolumen(Transportierbar tDetails) {
        return tDetails.berechneVolumen();
    }

    public static String erstelleBeschriftung(Transportierbar tDetails) {
        String text = tDetails.beschriftung();

        if (tDetails.zerbrechlich()) {
            return "-Zerbrechlich- " + text;
        }

        return text;
    }


}