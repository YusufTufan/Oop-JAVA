public class Repeat {
    public static void main(String[] args) {
    int[] dizi = {2, 3, 4, 5, 6, 3, 4, 3, 2, 3, 4, 3, 5};
    int enCokTekrarEdenSayi = enCokTekrarEdenSayiyiBul(dizi);
    System.out.println("En çok tekrar eden sayı: " + enCokTekrarEdenSayi);
    }
    public static int enCokTekrarEdenSayiyiBul(int[] dizi) {
        // En çok tekrar eden sayıyı ve tekrar sayısını tutacak değişkenleri tanımlayalım
    int enCokTekrarEdenSayi = 0;
    int maksimumTekrar = 0;
        // Her bir dizi elemanını kontrol ederek tekrar sayılarını bulalım
    for (int i = 0; i < dizi.length; i++) {
        int suankiSayi = dizi[i];
        int suankiTekrar = 1; // Mevcut sayının kendisini bir kere saydık
        // Dizi boyunca diğer elemanlarla karşılaştırarak tekrar sayısını bulalım
        for (int j = i + 1; j < dizi.length; j++) {
            if (dizi[j] == suankiSayi) {
                suankiTekrar++;
                }
             }
        // Mevcut sayının tekrar sayısı, şu ana kadar bulduğumuz en yüksek tekrar sayısından büyükse
        // en çok tekrar eden sayıyı güncelleyelim
            if (suankiTekrar > maksimumTekrar) {
                enCokTekrarEdenSayi = suankiSayi;
                maksimumTekrar = suankiTekrar;
                }
            }
        return enCokTekrarEdenSayi;
            }
        }