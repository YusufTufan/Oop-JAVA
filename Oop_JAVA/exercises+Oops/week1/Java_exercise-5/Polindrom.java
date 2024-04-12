import java.util.Scanner;
public class Polindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(">>Lütfen 5 basamakli bir sayı giriniz: ");
        int sayi = scanner.nextInt();                                 //5 basamaklı sayı istemek.

        int  basamak_1 = sayi/10000 ;                                 //Basamaklarına erişmek.
        int basamak_2 = (sayi%10000)/1000 ;
        int basamak_3 = (sayi%1000)/100 ;
        int basamak_4 = (sayi%100)/10;
        int basamak_5 = (sayi%10);

        String Polindrom_Kontrol;                                    //Polindromluğunu kontrol etmek.
        if(basamak_1==basamak_5 && basamak_2==basamak_4){
            Polindrom_Kontrol = "polindrom bir sayidir";
        }else{
            Polindrom_Kontrol = "polindrom degildir";
        }
        System.out.println(">>" + sayi + " " + Polindrom_Kontrol);    //Sonucu yazdırmak.
        scanner.close();
     }
}