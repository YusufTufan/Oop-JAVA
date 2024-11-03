import java.util.*;
public class TextIsleme {
    private String orjinalText;
    private String degistirilmisText;
    private List<Kelime> kelimeListesi;

    public TextIsleme(String orjinalText) {
        this.orjinalText = orjinalText;
        this.kelimeListesi = new ArrayList<>();
        this.kelimeAyikla();
    }
    public String getDegistirilmisText() {
        return degistirilmisText;
    }
    public String getOrjinalText() {
        return orjinalText;
    }

    private void kelimeAyikla() {
        // Noktalama işaretlerini sil
        this.degistirilmisText = this.orjinalText.replaceAll("\\p{Punct}", "");
        String[] kelimeler = this.degistirilmisText.split("\\s+"); // Boşluklara göre ayır

        for (String kelime : kelimeler) {
            boolean varMi = false;
            for (Kelime kelimeObj : this.kelimeListesi) {
                if (kelimeObj.getIcerik().equalsIgnoreCase(kelime)) {
                    kelimeObj.artirFrekans();
                    varMi = true;
                    break;
                }
            }
            if (!varMi) {
                Kelime yeniKelime = new Kelime(kelime);
                this.kelimeListesi.add(yeniKelime);
            }
        }
    }

    public void noktalamaIsaretleriniSil() {
        this.degistirilmisText = this.orjinalText.replaceAll("\\p{Punct}", "");
    }

    public List<String> kelimeListesiGetir() {
        List<String> kelimeler = new ArrayList<>();
        String[] kelimelerArray = this.degistirilmisText.split("\\s+"); // Boşluklara göre ayır

        for (String kelime : kelimelerArray) {
            kelimeler.add(kelime);
        }
        return kelimeler;
    }

    public int kelimeSayisi(String arananKelime) {
        int sayac = 0;
        for (Kelime kelime : this.kelimeListesi) {
            if (kelime.getIcerik().equalsIgnoreCase(arananKelime)) {
                sayac += kelime.getFrekans();
            }
        }
        return sayac;
    }

    public List<Kelime> frekansListesi() {
        List<Kelime> siraliListe = new ArrayList<>(this.kelimeListesi);
        siraliListe.sort(Comparator.comparing(Kelime::getFrekans).reversed());
        return siraliListe;
    }

    public List<Kelime> alfabetikSiralama() {
        List<Kelime> siraliListe = new ArrayList<>(this.kelimeListesi);
        siraliListe.sort(Comparator.comparing(Kelime::getIcerik));
        return siraliListe;
    }
}