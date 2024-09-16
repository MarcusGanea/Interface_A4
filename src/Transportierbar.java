// Datei: src/Transportierbar.java
public interface Transportierbar {
    float MAX_GEWICHT_PRO_FLAECHE = 29.99f;

    float gewicht();
    float laenge();
    float breite();
    float hoehe();

    boolean zerbrechlich();
    String beschriftung();

    default float berechneVolumen() {
        return (laenge() * breite() * hoehe());
    }
}