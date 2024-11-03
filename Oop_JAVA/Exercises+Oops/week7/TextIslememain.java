public class TextIslememain {
public static void main(String[] args) {
    String orjinalMetin = "Bu bir örnek metindir. Metin örnek bir cümle içerir.";
    TextIsleme textIsleme = new TextIsleme(orjinalMetin);

    System.out.println("Orjinal Metin: " + textIsleme.getOrjinalText());

    textIsleme.noktalamaIsaretleriniSil();
    System.out.println("Noktalama İşaretleri Silinmiş Metin: " + textIsleme.getDegistirilmisText());

    System.out.println("Kelime Listesi: " + textIsleme.kelimeListesiGetir());

    String arananKelime = "örnek";
    System.out.println("'" + arananKelime + "' kelimesi metinde " + textIsleme.kelimeSayisi(arananKelime) + " kez geçiyor.");

    System.out.println("Frekans Listesi: " + textIsleme.frekansListesi());

    System.out.println("Alfabetik Sıralama: " + textIsleme.alfabetikSiralama());
    }
}