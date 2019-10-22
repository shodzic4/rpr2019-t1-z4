package ba.unsa.etf.rpr;

public class Artikl {
    private String Naziv;
    public int Cijena;
    public String Kod;

    public Artikl(String naziv, int cijena, String kod) {
        Naziv = naziv;
        Cijena = cijena;
        Kod = kod;
    }

    public String getKod() {
        return Kod;
    }
    public int getCijena() {
        return Cijena;
    }
    public String getNaziv() {
        return Naziv;
    }
}