public class Kelime {
    private String icerik;
    private int uzunluk;
    private int frekans;

    public Kelime(String icerik) {
        this.icerik = icerik;
        this.uzunluk = icerik.length();
        this.frekans = 1; // Yeni kelime eklendiğinde frekansı 1 olarak başlatılır.
    }

    public String getIcerik() {
        return icerik;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public int getFrekans() {
        return frekans;
    }

    public void artirFrekans() {
        this.frekans++;
    }

    @Override
    public String toString() {
        return "Kelime: " + icerik + ", Uzunluk: " + uzunluk + ", Frekans: " + frekans;
    }
}