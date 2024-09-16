// Datei: src/Transportierbar.java
public interface Transportierbar {
    float MAX_GEWICHT_PRO_FLAECHE = 29.99f;

    int gewichtKg();
    int laengeCm();
    int breiteCm();
    int hoeheCm();

    boolean zerbrechlich();
    boolean stapelbar();
    String beschriftung();

    default float berechneVolumen() {
        return (laengeCm() / 100.0f) * (breiteCm() / 100.0f) * (hoeheCm() / 100.0f);
    }
}