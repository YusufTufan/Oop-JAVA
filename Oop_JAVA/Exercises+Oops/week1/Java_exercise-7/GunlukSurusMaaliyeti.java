import java.util.Scanner;
public class GunlukSurusMaaliyeti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Günlük katettiğiniz mesafe kaç mil? ");
        double gunluk_mesafe = scanner.nextDouble();//Günlük mesafe bilgisini almak.

        System.out.print("Aldığınız bir galon benzinin fiyatı nedir? ");
        double galon_maaliyet = scanner.nextDouble();//Aldığı benzinin fiyat bilgisini almak.

        System.out.print("Mil başına ne kadar galonluk benzin harcıyorsun? ");
        double mil_basina_galon  = scanner.nextDouble();//Mil başına harcanan benzin bilgisini almak.

        System.out.print("Otoparkın saatlik ücreti ne kadar? ");
        double oto_saatlik_ucret = scanner.nextDouble();//Otoparkın saatlik ücret bilgisini almak.

        System.out.print("Araban otoparkta kaç saat geçirdi ");
        double oto_gecen_sure = scanner.nextDouble();//Otoparkta geçen sürenin bilgisini almak.

        System.out.print("Günde kaç kez geçiş ücreti ödedin?");
        int gecis_sayisi = scanner.nextInt();//Kaç kez geçiş ücreti ödedi bilgisini almak.

        System.out.print("Her geçişte ne kadar ödedin? ");
        double gecis_ucreti = scanner.nextDouble();//Geçiş ücreti bilgisini almak.

        double Gunluk_Surus_Maaliyeti;
        Gunluk_Surus_Maaliyeti = ((gunluk_mesafe*galon_maaliyet)*(mil_basina_galon/1)) + oto_gecen_sure*oto_saatlik_ucret + gecis_sayisi*gecis_ucreti;//Maaliyet hesabı
        System.out.print("Günlük sürüş maaliyeti: "+Gunluk_Surus_Maaliyeti);//Maal,yeti  yazdır.
        scanner.close();
    }
}