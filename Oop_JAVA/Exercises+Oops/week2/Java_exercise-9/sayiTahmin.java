import java.util.Random;  //random sayı üretmek için
import java.util.Scanner;
public class sayiTahmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int random_number;
       
        random_number = random.nextInt(100)+1;//random.nextInt 0-99 üretir(100 yazarsak) +1 ile 1-100 arası oluşturuyoruz.

        while(true){
        System.out.print("Lütfen tahmininizi giriniz: ");
        int tahmin = scanner.nextInt();  //Sürekli sayı istemi true ile yakalıyoruz.

        if(random_number==tahmin){
            System.out.print("Tebrik ederiz,Doğru cevap: "+tahmin);
            break;  //tahmin doğruysa programı sonlandırıyoruz.
        }
        else if(tahmin<0 || tahmin>100){
            System.out.println(tahmin+" Geçersiz tahmin!!! (1-100 arası bir rakam dene...)"); //Ek yönlendirme
        }
        else if(random_number < tahmin){
            System.out.print("Şuanlık cevabın yanlış... Tahmin edilen sayıdan daha yukarıdasın... Tekrar Dene!!"); //Aşağı yönlendirme
        }else{
            System.out.print("Şuanlık cevabın yanlış... Tahmin edilen sayıdan daha aşağıdasın... Tekrar Dene!!"); //Yukarı yönlendirme
        }
    }
    scanner.close();
    }
}