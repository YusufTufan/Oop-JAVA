import java.util.ArrayList;
public class Cok_Bosluklu_Kelime_Listeleme {
    public static void main(String[] args) {
            String cumle = "Bu    bir  test   cümlesidir.  ";
            System.out.println("Listelenecek cümle: " + cumle);
            ArrayList<String> kelimeler = kelimelisteleme(cumle);
    
            System.out.println("Kelimeler:");
            for (String kelime : kelimeler) {
                System.out.println(kelime);
            }
        }
        public static ArrayList<String> kelimelisteleme(String cumle) {
            ArrayList<String> kelimeler = new ArrayList<>();
            int startIndex = 0;
            boolean kelimeBasladi = false;
    
            for (int i = 0; i < cumle.length(); i++) {
                if (cumle.charAt(i) != ' ') {
                    if (!kelimeBasladi) {
                        startIndex = i; // Kelimenin başlangıç indeksini güncelle
                        kelimeBasladi = true;
                    }
                } else {
                    if (kelimeBasladi) {
                        // Kelimenin sonunu bulduk, kelimeyi al ve listeye ekle
                        String kelime = cumle.substring(startIndex, i);
                        kelimeler.add(kelime);
                        kelimeBasladi = false;
                    }
                }
            }
            // Son kelimeyi ekle
            if (kelimeBasladi) {
                String sonKelime = cumle.substring(startIndex);
                kelimeler.add(sonKelime);
            }
            return kelimeler;
    }
}