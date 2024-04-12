import java.util.Scanner; // Scanner importu...
public class Buyuksayi {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ilk sayıyı giriniz:"); //Kullanıcıdan ilk sayıyı almak.
        int sayi1 = scanner.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz:"); //Kullanıcıdan ikinci sayıyı almak.
        int sayi2 = scanner.nextInt();
        System.out.println("Lütfen üçüncü sayıyı giriniz:"); //Kullanıcıdan üçüncü sayıyı almak.
        int sayi3 = scanner.nextInt();
        
        int enBuyuk=0;
        if                                     //En büyük sayı tespiti yapılan if bloğu...
        (sayi1 >= sayi2 && sayi1 >= sayi3){
            enBuyuk= sayi1;
        }else if(sayi2>=sayi1 && sayi2>=sayi3){
            enBuyuk= sayi2;
        }else if(sayi3>=sayi1 && sayi3>=sayi2){
            enBuyuk= sayi3;
        }
        System.out.println("En büyük sayı: " + enBuyuk); //En büyük sayıyı yazdırıyor.
        scanner.close();
    }
}