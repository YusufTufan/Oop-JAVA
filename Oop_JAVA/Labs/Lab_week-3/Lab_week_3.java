import java.util.Scanner;
public class Lab_week_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Uygulama-1 denemeleri...
        String mesaj = "HELLO ALL THERE";
        String sifreliMesaj = SezarEncrypt(mesaj, 7);
        System.out.println("İlk  Mesaj: "+mesaj+"\n"+"Yeni Mesaj: "+ sifreliMesaj);
        String DesifrelenmisMesaj = SezarDecrypt(sifreliMesaj, 7);
        System.out.println("Eski Mesaj: "+ DesifrelenmisMesaj);

        //Uygulama-2 için denemeler...
        System.out.print("Metni giriniz: ");
        String metin = scanner.nextLine();

        System.out.print("Anahtarı giriniz: ");
        String anahtar = scanner.nextLine();

        String sifrelimetin = vigenereSifrele(metin, anahtar);
        System.out.println(sifrelimetin);

        scanner.close();
    }
    //Uygulama-1 (Sezar Şifreleme ve Deşifreleme)
    public static String SezarEncrypt(String mesaj,int key){

        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String encryptAlph = alph.substring(key)+alph.substring(0, key);
        StringBuilder encryptMesssage = new StringBuilder(mesaj);

        for (int i = 0; i < mesaj.length(); i++) {
           char letter =  mesaj.charAt(i);
           int index = alph.indexOf(letter); //İlk bulduğu değerdeki indexi döndürür.
            if(index>=0){
                char newLetter = encryptAlph.charAt(index);
                encryptMesssage.setCharAt(i, newLetter);
            }
        }
        return encryptMesssage.toString();
    }
    public static String SezarDecrypt(String encryptedmesaj,int key){
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String encryptAlph = alph.substring(key)+alph.substring(0, key);
        StringBuilder decryptMesssage = new StringBuilder(encryptedmesaj);

        for (int i = 0; i < encryptedmesaj.length(); i++) {
            char letter = encryptedmesaj.charAt(i);
            int index = encryptAlph.indexOf(letter);
            if(index>=0){
                char newLetter = alph.charAt(index);
                decryptMesssage.setCharAt(i, newLetter);
            }  
        }
        return decryptMesssage.toString(); 
    }
    //Uygulama-2 (Vigenere Şifreleme)
    public static String vigenereSifrele(String metin, String anahtar){
        StringBuilder sifreliMetin = new StringBuilder();
        int index = 0;
        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);
            char anahtarKarakter = anahtar.charAt(index);

            int asciKarakter = (int) karakter;
            int asciAnahtarKarakter = (int) anahtarKarakter;

            int yeniAsci = (asciKarakter + asciAnahtarKarakter) % 26;

            char sifreliKarakter = (char) (yeniAsci+'A');

            sifreliMetin.append(sifreliKarakter);

            index = (index+1) % anahtar.length();
        }
        return sifreliMetin.toString();
    }
}