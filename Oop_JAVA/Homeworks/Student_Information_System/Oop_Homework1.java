import java.util.Scanner;
public class Oop_Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ogrenci_sayisi = 0;
        int    [] ogrenci_kimlikleri = {};
        String [] ogrenci_adlari = {};
        double [] ogrenci_ara_sinav_notlari = {};
        double [] ogrenci_final_notlari = {};
        double [] donem_sonu_notlari = {};
        boolean Menu_dongusu = true;
        boolean ogrenci_Sayisi_girildi = false;
        boolean final_puani_kontrolu = false;

        while(Menu_dongusu){
        System.out.println("|         Ana menüye hoşgeldiniz.Yapmak istediğin işlemi seç!          |");
        System.out.println("|                                                                      |");
        System.out.println("|1-) Öğrenci bilgilerini giriniz :                                     |");
        System.out.println("|                                                                      |");
        System.out.println("|2-) Girilmiş öğrenci bilgilerini listele :                            |");
        System.out.println("|                                                                      |");
        System.out.println("|3-) Öğrencilerin dönem sonu notlarını hesapla...                      |");
        System.out.println("|                                                                      |");
        System.out.println("|4-) Final sınavı 60 altında olan öğencilerin bilgilerini listele...   |");
        System.out.println("|                                                                      |");
        System.out.println("|5-) Dönem sonu notu sınıf ortalamasının üzerinde olan öğrenciler :    |");
        System.out.println("|                                                                      |");
        System.out.println("|6-) En düşük vize notu :                                              |");
        System.out.println("|                                                                      |");
        System.out.println("|7-) En yüksek final notu :                                            |");
        System.out.println("|                                                                      |");
        System.out.println("|0-) Programdan çıkılıyor...                                           |");
        System.out.println("|                                                                      |");
        System.out.print("  |-)Seçiminiz : ");

        int secim = scanner.nextInt();
        if(secim == 1){
            if(!ogrenci_Sayisi_girildi)
        System.out.print(">> Sınıftaki öğrenci sayısını girer misiniz? ");
        ogrenci_sayisi = scanner.nextInt();
        ogrenci_Sayisi_girildi = true;
        
        if(ogrenci_sayisi <= 0){
            System.out.print(">> Geçersiz öğrenci sayısı girdiniz. Programdan çıkılıyor...");
            return;
        }else{
        ogrenci_kimlikleri = new int[ogrenci_sayisi];
        ogrenci_adlari = new String[ogrenci_sayisi];
        ogrenci_ara_sinav_notlari = new double[ogrenci_sayisi];
        ogrenci_final_notlari = new double[ogrenci_sayisi];

        for (int i = 0; i < ogrenci_sayisi; i++) {
            System.out.println(">>Öğrenci-" + (i+1) + " için istenilen bilgileri giriniz: ");

            System.out.println(">> Öğrenci kimliğini giriniz: ");
            ogrenci_kimlikleri[i] = scanner.nextInt();

            scanner.nextLine();

            System.out.println(">> Öğrenci adını giriniz: ");
            ogrenci_adlari[i] = scanner.nextLine();

            System.out.println(">>Öğrencinin ara sınav notunu giriniz: ");
             double vize_notu = scanner.nextDouble();
             if(vize_notu < 0){
                ogrenci_ara_sinav_notlari[i] = 0;
             }else if(vize_notu > 100){
                ogrenci_ara_sinav_notlari[i] = 100;
             }else{
                ogrenci_ara_sinav_notlari[i] = vize_notu;
             }

            System.out.println(">>Öğrencinin final sınavını giriniz: ");
            double final_notu = scanner.nextDouble();
            if(final_notu < 0){
                ogrenci_final_notlari[i] = 0;
            }else if (final_notu > 100){
                ogrenci_final_notlari[i] = 100;
            }else{
                ogrenci_final_notlari[i] = final_notu;
            }
        }  
    }
    }
    else if (secim == 2){
        System.out.println(">>Öğrenci bilgileriniz listeleniyor...");
        for(int i = 0; i < ogrenci_sayisi; i++){
            System.out.println(">>Öğrenci-" + (i + 1) + " | " + "Kimlik: " + ogrenci_kimlikleri[i] +" | "+ " Ad: " + ogrenci_adlari[i] +" | "+ " Ara Sınav Notu: " + ogrenci_ara_sinav_notlari[i] +" | "+ " Final Notu: " + ogrenci_final_notlari[i] + "Dönem Sonu Notu: " + donem_sonu_notlari[i] );
        }
    }
    else if (secim == 3){
        donem_sonu_notlari = new double[ogrenci_sayisi];
        for (int i = 0; i<ogrenci_sayisi; i++){
            donem_sonu_notlari[i] = (ogrenci_ara_sinav_notlari[i]*0.4 + ogrenci_final_notlari[i]*0.6);
            System.out.println(">>Öğrenci:"+ ogrenci_adlari[i] + " | " + " Dönem sonu puanı: "+donem_sonu_notlari[i]);
        } 
    }
    else if (secim == 4){
        System.out.println(">>Final sınavı 60 puanın altındaki öğrenci bilgileri:");
        for(int i = 0; i < ogrenci_sayisi; i++){
            if(ogrenci_final_notlari[i]<60){
                System.out.println(">>Kimlik: " + ogrenci_kimlikleri[i] +" | "+ "Ad: " + ogrenci_adlari[i] + " | "+ "Final Notu: " + ogrenci_final_notlari[i]);
                final_puani_kontrolu = true;
            }
        }
        if(!final_puani_kontrolu){
            System.out.println(">>60 puan altında not olan öğrenci yoktur.");
        }
    }
    else if (secim == 5){
        double toplanmis_not = 0.0;
        double sinifin_ortalamasi =0.0;
        int sayac = 0 ;
        for(int i = 0; i < ogrenci_sayisi ; i++){
            toplanmis_not += (ogrenci_ara_sinav_notlari[i]*0.4 + ogrenci_final_notlari[i]*0.6);
            sayac++;
        }
        sinifin_ortalamasi = (toplanmis_not / sayac);

        System.out.println(">>Sınıf ortalamasının üzerinde ortalaması olan öğrenci bilgileri listeleniyor...");
        for(int i = 0; i < ogrenci_sayisi ; i++){
            double ogrenci_notu = (ogrenci_ara_sinav_notlari[i]*0.4 + ogrenci_final_notlari[i]*0.6);
            if(ogrenci_notu > sinifin_ortalamasi){
                System.out.println(">>Kimlik : " + ogrenci_kimlikleri[i] + " | "+ "Ad : " + ogrenci_adlari[i] + " | "+ " Dönem Sonu Notu : "+ donem_sonu_notlari[i]);
            }
        }
    }
    else if (secim == 6){
        double minumum_vize_notu = ogrenci_ara_sinav_notlari[0];
        for(int i = 1; i < ogrenci_sayisi; i++){
            if(ogrenci_ara_sinav_notlari[i] < minumum_vize_notu){
                minumum_vize_notu = ogrenci_ara_sinav_notlari[i];
            }
        }
        System.out.println(">>Minumum vize notu : " + minumum_vize_notu);
    }
    else if (secim == 7){
        double maximum_final_notu = ogrenci_final_notlari[0];
        for (int i = 1; i < ogrenci_sayisi; i++){
            if(ogrenci_final_notlari[i] > maximum_final_notu){
                maximum_final_notu = ogrenci_final_notlari[i];
            }
        }
        System.out.println(">>Maksimum final notu: " + maximum_final_notu);
    }else if (secim == 0){
        System.out.println(">>Programdan çıkılıyor.");
        scanner.close();
        Menu_dongusu= false;
    }else {
        System.out.println(">>Yanlış seçim. İyi günler!");
    }
    }scanner.close(); 
    }
}