package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    Supermarket k;
    Supermarket t;
    @BeforeEach
    void setup() {
        k = new Supermarket();
        k.dodajArtikl(new Artikl("biciklo", 150, "15555"));
        k.dodajArtikl(new Artikl("voz", 100,"2000"));
        k.dodajArtikl(new Artikl("automobil",15000,"1200"));
    }

    @Test
    void dodajArtikl() {
        assertTrue(k.dodajArtikl(new Artikl("auto", 1500 , "15000" )));
        for(int i=0; i<996; i++){
            k.dodajArtikl(new Artikl("auto", 1500, String.valueOf(i)));
        }
        assertFalse(k.dodajArtikl((new Artikl("automobil", 2000, "9999"))));
    }
    /*
    @Test
    void izbaciArtiklSaKodom() {
        //Postoji li bolji način za testiranjem ove metode? i kako je moguće na ovakav način testirati ?
        k.izbaciArtiklSaKodom("1200");
        t = new Supermarket();
        t.dodajArtikl(new Artikl("biciklo", 150, "15555"));
        t.dodajArtikl(new Artikl("voz", 100, "2000"));
        assertEquals(t.getArtikli(), k.getArtikli());
    }

     */


}