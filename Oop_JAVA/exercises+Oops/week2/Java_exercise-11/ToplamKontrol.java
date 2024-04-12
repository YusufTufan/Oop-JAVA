import java.util.Scanner;
public class ToplamKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int number;
        
        System.out.println("Sayıları giriniz(Eğer -1 girerseniz toplama işlemi sona erecektir): ");
        do{                                              //Do while seçme nedenimiz sağlanmadığı an direk terk etsin.
            System.out.print("Lütfen sayıyı giriniz: ");
             number = scanner.nextInt();                //Sayı istemi

            if (number != -1){
                sum +=number;
            }
        }while(number != -1);                           //Her defasında -1 mi değil mi ?
        System.out.print("Sistem kapanana kadar giriş yapılan sayıların toplamı: "+sum);
        scanner.close();
    }
}