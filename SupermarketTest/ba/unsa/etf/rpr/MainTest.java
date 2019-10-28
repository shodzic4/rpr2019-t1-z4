package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class MainTest {
    Supermarket supermarket;
    @BeforeEach
    void setup() {
        supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        supermarket.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
    }
    /*ne uspjeva, kako ovo postici? javlja poruku actual and formal argument lists differ in length
    @Test
    void ispisArtikala() {
        assertEquals("Naziv: Biciklo, Kod: 1, Cijena: 1000 KM\nNaziv: Biciklo, Kod: 2, Cijena: 1000 KM", ispisArtikala(supermarket.getArtikli()));
    }

     */
    /*
    @Test
    void main() {
    prijedlog za testiranje?
    }

     */
}