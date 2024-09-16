public class Main {
    public static void main(String[] args) {
        Tisch tisch = new Tisch(50, 200, 100, 75, false, true, "Holztisch");
        Schaf schaf = new Schaf(70, 150, 50, 100, false, false, "Schaf");

        System.out.println("Volumen des Tisches: " + tisch.berechneVolumen() + " m³");
        System.out.println("Volumen des Schafs: " + schaf.berechneVolumen() + " m³");
    }
}