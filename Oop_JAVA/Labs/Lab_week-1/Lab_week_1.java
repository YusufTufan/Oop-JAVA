import java.util.Scanner;
public class Lab_week_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Uygulama-1
        System.out.println("LÜTFEN ADINIZI GİRİNİZ:");
        String ad = scanner.nextLine();
        System.out.println("LÜTFEN SOYADINIZI GİRİNİZ:");
        String soyad = scanner.nextLine();
        System.out.println("Kişinin adı ve soyadı "+ ad + " " + soyad);
        
        //Uygulama-2
        System.out.println("İlk sayıyı giriniz...");
        int sayi1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz.");
        int sayi2 = scanner.nextInt();
        int toplam = sayi1 + sayi2;
        System.out.println(toplam);
        System.out.println(toplam);
        System.out.println(toplam);
        System.out.println(toplam);
        System.out.println(toplam);

        //Uygulama-3
        double d=0.00001,sum=0;
        for(double x =-5 ; x<=5; x+=d){
            sum += d*(x*x);
        };
        System.out.println("Alan= "+sum);
        scanner.close();
    }
}