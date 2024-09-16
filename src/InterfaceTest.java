// Datei: src/InterfaceTest.java
public class InterfaceTest {
    private static Transporter transporter = new Transporter();

    public static boolean transportMachbar(Transportierbar tDetails) {
        return transporter.isTransportable(tDetails);
    }

    public static String transportUnmoeglichGrund(Transportierbar tDetails) {
        return transporter.getTransportabilityReason(tDetails);
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