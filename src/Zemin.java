public class Zemin {
    private String acıklama;
    private double genislik;
    private double uzunluk;

    public Zemin(String acıklama, double genislik, double uzunluk) {
        acıklama = acıklama;
        setGenislik(genislik);
        setUzunluk(uzunluk);
    }

    public Zemin() {
    }

    public String getAcıklama() {
        return acıklama;
    }

    public void setAcıklama(String acıklama) {
        acıklama = acıklama;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        if (genislik>0)
            this.genislik = genislik;

        }


    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        if (uzunluk>0)
        this.uzunluk = uzunluk;
    }
    public double alanHesapla(){
       return  genislik*uzunluk;

    }

    @Override
    public String toString() {
        return String.format("%s -%5.2f - %5.2f",acıklama, genislik,uzunluk);
    }

}
