import java.util.ArrayList;
public class Kelime_Listeleme {
    public static void main(String[] args) {
        String cumle ="Bu bir test cümlesidir.";
        System.out.println("Listelenecek cümle: "+ cumle);
        ArrayList<String> kelimeler = kelimelisteleme(cumle);

        System.out.println("Kelimeler:");
        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }
    }
    public static ArrayList<String> kelimelisteleme(String cumle){
        ArrayList<String> kelimeler = new ArrayList<>();
        int startindex =0;

        for (int i = 0; i < cumle.length(); i++) {
            if(cumle.charAt(i) == ' '){
                String kelime =cumle.substring(startindex,i);
                kelimeler.add(kelime);
                startindex = i+1;
            } 
        }
        String sonKelime = cumle.substring(startindex);
        kelimeler.add(sonKelime);
        return kelimeler;
    }
}