package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] artikli = new Artikl[50];
    private int BrojArtikala=0;
    public boolean dodajArtikl(Artikl a){
        if(BrojArtikala<50){
            artikli[BrojArtikala]=a;
            BrojArtikala=BrojArtikala+1;
        }
        else return false;
        return true;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        Artikl a=null;
        for(int i=0; i<BrojArtikala; i++){
            if(artikli[i].getKod().equalsIgnoreCase(kod)){
                a=artikli[i];
                for(int j=i; j<BrojArtikala-1; j++) artikli[j]=artikli[j+1];
                BrojArtikala=BrojArtikala-1;
                artikli[BrojArtikala]=null;
            }
        }
        return a;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }
    public int dajUkupnuCijenuArtikala(){
        int suma=0;
        for(int i=0; i<BrojArtikala; i++){
            suma=suma+artikli[i].getCijena();
        }
        return suma;
    }
}

