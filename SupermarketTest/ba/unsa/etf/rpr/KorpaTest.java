package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    Korpa k;
    @BeforeEach
    void setup() {
        k = new Korpa();
        k.dodajArtikl(new Artikl("biciklo", 150, "155"));
        k.dodajArtikl(new Artikl("voz", 100,"2000"));
        k.dodajArtikl(new Artikl("automobil",15000,"1200"));
    }

    @Test
    void dodajArtikl() {
        assertTrue(k.dodajArtikl(new Artikl("auto", 1500 , "15000" )));
        for(int i=0; i<46; i++){
            k.dodajArtikl(new Artikl("auto", 1500, String.valueOf(i)));
        }
        assertFalse(k.dodajArtikl((new Artikl("automobil", 2000, "9999"))));
    }

    @Test
    void izbaciArtiklSaKodom() {
        k.izbaciArtiklSaKodom("1200");
        assertEquals(250,k.dajUkupnuCijenuArtikala());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        k.dodajArtikl(new Artikl("avion", 1000000, "5656"));
        assertEquals(1015250, k.dajUkupnuCijenuArtikala());
    }
}