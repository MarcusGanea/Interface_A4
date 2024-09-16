// Datei: src/Transporter.java
public class Transporter {
    private final float MAX_GEWICHT_PRO_FLAECHE = 29.99f;
    private final float MAX_LENGTH = 100.0f;
    private final float MAX_HEIGHT = 100.0f;
    private final float MAX_WIDTH = 100.0f;

    public boolean isTransportable(Transportierbar tDetails) {
        return getTransportabilityReason(tDetails) == null;
    }

    public String getTransportabilityReason(Transportierbar tDetails) {
        if (tDetails.laenge() > MAX_LENGTH) {
            return "Zu lang: " + tDetails.laenge() + " cm";
        }
        if (tDetails.breite() > MAX_WIDTH) {
            return "Zu breit: " + tDetails.breite() + " cm";
        }
        if (tDetails.hoehe() > MAX_HEIGHT) {
            return "Zu hoch: " + tDetails.hoehe() + " cm";
        }
        float gewichtProFlaeche = tDetails.gewicht() / (tDetails.laenge() * tDetails.breite());
        if (gewichtProFlaeche > MAX_GEWICHT_PRO_FLAECHE) {
            return "Zu schwer: " + tDetails.gewicht() + " kg";
        }
        if (tDetails.zerbrechlich()) {
            return "Zerbrechlich";
        }
        return null;
    }
}