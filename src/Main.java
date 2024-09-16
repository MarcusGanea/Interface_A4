// Datei: src/Main.java
public class Main {
    public static void main(String[] args) {
        Tisch myTisch = new Tisch("2014.AE Esstisch", false, 27.3F, 3.0F, 2.2F, 1.3F);
        Schaf mySchaf = new Schaf("Cloud", true, 42.9F, 1.1F, 0.82F, 0.55F);

        System.out.println("\nTransportdetails fuer den Tisch:\n");
        System.out.println("Volumen:             " + InterfaceTest.berechneVolumen(myTisch) + " m^3");
        System.out.println("Verpackungsaufdruck: " + InterfaceTest.erstelleBeschriftung(myTisch));
        System.out.println("Transport machbar:   " + InterfaceTest.transportMachbar(myTisch));

        System.out.println("\n\nTransportdetails fuer das Schaf:\n");
        System.out.println("Volumen:             " + InterfaceTest.berechneVolumen(mySchaf) + " m^3");
        System.out.println("Verpackungsaufdruck: " + InterfaceTest.erstelleBeschriftung(mySchaf));
        System.out.println("Transport machbar:   " + InterfaceTest.transportMachbar(mySchaf));
    }
}