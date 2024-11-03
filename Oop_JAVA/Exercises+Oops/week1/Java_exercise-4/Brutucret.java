import java.util.Scanner;
public class Brutucret {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lütfen haftalk çalışma sürenizi giriniz:");    //Kullanıcıdan çalışma süresini almak
        int calisma_suresi = scanner.nextInt();
        System.out.println("Saatlik ücretinizi giriniz:");                 //Kullanıcıdan Saatlik ücretini almak
        int saatlik_ucret = scanner.nextInt();

        double  haftalik_ucret;
        if (calisma_suresi<= 40)     //Bu if bloğunda çalışma saati 40 saati geçerse, her saat 1.5 maaş alır. Bu duruma göre haftalık ücreti hesaplamak.
        haftalik_ucret = calisma_suresi * saatlik_ucret;
        else
        haftalik_ucret = 40*saatlik_ucret + (calisma_suresi-40)*(saatlik_ucret*1.5);
        
        System.out.println("Haftalik ücretiniz:" + haftalik_ucret);              //Haftalık ücreti yazdırmak.
        scanner.close();
    }
}