public class En_kisa_cumle {
    public static void main(String[] args) {
        String cumle = "Bu bir test cümlesidir";
        String en_kisa_kelime = enKisaKelimeyiBul(cumle);
        System.out.println("En kısa kelime: "+en_kisa_kelime);
    }
    public static String enKisaKelimeyiBul(String cumle){
        String [] kelimeler = cumle.split(" ");
        String en_kisa_kelime = kelimeler[0];

        for (int i = 0; i < kelimeler.length; i++) {
            if(kelimeler[i].length()<en_kisa_kelime.length()){
                en_kisa_kelime = kelimeler[i];
            }
        }
        return en_kisa_kelime;
    }
}