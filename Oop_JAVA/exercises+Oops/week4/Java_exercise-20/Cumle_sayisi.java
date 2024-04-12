public class Cumle_sayisi {

    public static void main(String[] args) {
        String cumle = "Bu bir test cümlesidir";
        int kelimeSayisi = kelimeSayisiniBul(cumle);
        System.out.println("Cümledeki kelime sayısı: " + kelimeSayisi);
    }
    public static int kelimeSayisiniBul(String cumle) {
        int kelimeSayisi = 0;
        boolean kelimeBasladi = false;

        for (int i = 0; i < cumle.length(); i++) {
            char karakter = cumle.charAt(i);
            if (karakter != ' ') {
                if (!kelimeBasladi) {
                    // Kelimenin başlangıcını işaretle
                    kelimeBasladi = true;
                    kelimeSayisi++;
                }
            } else {
                // Boşluk karakteri bulunduğunda kelimenin sonu gelmiş olur
                kelimeBasladi = false;
            }
        }
        return kelimeSayisi;
    }
}