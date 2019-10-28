package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {
    Artikl a;
    @BeforeEach
    void setup() {
        a = new Artikl("lopta",150,"111");
    }
    @Test
    void getKod() {
        assertEquals("111", a.getKod());
    }

    @Test
    void getCijena() {
        assertEquals(150,a.getCijena());
    }

    @Test
    void getNaziv() {
        assertEquals("lopta", a.getNaziv());
    }
}