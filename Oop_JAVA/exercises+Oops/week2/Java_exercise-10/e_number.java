import java.util.Scanner;
public class e_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hesaplanacak sayıyı giriniz: ");      //Kullanıcıdan sayı istemek
        int number = scanner.nextInt();

        double e =1.0;
        int faktoriyel = 1;

        for(int i=1; i<=number; i++){      //iç içe for kullanarak istenilen yapı yakalanıyor.
            for(int j =1; j<=i; j++){
                faktoriyel *= j;
            }
            e += 1.0/faktoriyel;           //e'nin üstüne atama yapılıyor.
        }
        System.out.print("E değeri: "+e);  //e yazdırılıyor.
        scanner.close();
    }
}