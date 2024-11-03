public class Karakter_degisimi {  //Replace kullanmadan karakter değişimi yapabilmek için yazılan yapı...
    public static void main(String[] args) {
        String cumle = "Örnek cümledir";
        char degistirilecek_karakter = 'e';
        char degisecegi_karakter = 'x';
        System.out.println(cumle);
        System.out.println(karakter_degisimi(cumle, degistirilecek_karakter, degisecegi_karakter));
    }
    public static String karakter_degisimi(String yazi, char degistirilecek_karakter, char degisecegi_karakter) {
        char [] Karakter_dizisi = yazi.toCharArray();

        for (int i = 0; i < Karakter_dizisi.length; i++) {
            if(Karakter_dizisi[i] == degistirilecek_karakter){
                Karakter_dizisi[i] = degisecegi_karakter;
            }
        }
        String degismis_yazi = new String(Karakter_dizisi);
        return degismis_yazi;
    }
}