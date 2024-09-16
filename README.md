# 2aAPC_A2_Ganea
<a name="readme-top"></a>
# Interface
Author: Ganea Marcus-Alin <br>
LBS Eibiswald | 2aAPC <br>
Erstellt am 16.09.2024

Diese Anwendung ist die zeite Übung vom Labor ITL12...<br>

## Das Ziel der Übung
### Erstelle eine Elternklasse: Kontoklasse und drei Ableitungen: Girokonto, Sparkonto und Kreditkonto

•	Kontoverwaltung 
•	Es ist die Klassenstruktur sowie ein Menü zur Bedienung von zwei Konten zu implementieren.
•	Zwei Konten sind für die letzte Methode überweisen notwendig


## Installation

```cmd

git checkout origin/master
```
## oder
```cmd
git clone https://github.com/MarcusGanea/2aAPC_HelloWorld

```
<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Verwendung
Technologien im Einsatz:
[![Java][java.com]][java-url]

## Code Main.Java
```java
public class Main {
    public static void main(String[] args) {
        Tisch myTisch = new Tisch("2014.AE Esstisch", false, 27.3F, 3.0F, 2.2F, 1.3F);
        Schaf mySchaf = new Schaf("Cloud", true, 42.9F, 1.1F, 0.82F, 0.55F);

        System.out.println("\nTransportdetails fuer den Tisch:\n");
        System.out.println("Volumen:             " + InterfaceTest.berechneVolumen(myTisch) + " m^3");
        System.out.println("Verpackungsaufdruck: " + InterfaceTest.erstelleBeschriftung(myTisch));
        if (!InterfaceTest.transportMachbar(myTisch)) {
            System.out.println("Transport ist nicht moeglich: " + InterfaceTest.transportUnmoeglichGrund(myTisch));
        } else {
            System.out.println("Transport machbar");
        }

        System.out.println("\n\nTransportdetails fuer das Schaf:\n");
        System.out.println("Volumen:             " + InterfaceTest.berechneVolumen(mySchaf) + " m^3");
        System.out.println("Verpackungsaufdruck: " + InterfaceTest.erstelleBeschriftung(mySchaf));
        if (!InterfaceTest.transportMachbar(mySchaf)) {
            System.out.println("Transport ist nicht moeglich: " + InterfaceTest.transportUnmoeglichGrund(mySchaf));
        } else {
            System.out.println("Transport machbar");
        }
    }
}

```
<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Screenshots

![Screen Shot](A2_Kontoverwaltung/Screen1.png)

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[java.com]: https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white
[java-url]: https://www.java.com/de/
[product-screenshot]: Screen.png
