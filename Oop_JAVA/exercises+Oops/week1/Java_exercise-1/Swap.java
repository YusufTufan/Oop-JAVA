import java.util.Scanner; // Scanner importu
public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scannerı kullanmak için yazılması gereken satır

        System.out.println("Lütfen ilk sayıyı giriniz:"); //istenilen ilk sayı
        int number1 = scanner.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz:"); //istenilen ikinci sayı
        int number2 = scanner.nextInt();

        int gecici;          // swap ortamını sağlayan değişken
        gecici = number1;    //sayı1 ve gecici aynı sayı oldular.
        number1 = number2;   // sayı2 ve sayı1 aynı sayı oldular ancak sayı1 in değeri gecici değişkende
        number2 = gecici;    // gecicideki değer sayı2 ye atanıyor. sayı1 inde bir öceki satırda sayı2 değeriyle değişti

        System.out.println("ilk sayı:" + number1);    //sayı1 yazdır.
        System.out.println("ikinci sayı:" + number2); //sayı2 yazdır.
        scanner.close(); //Scannerı sonlandır.
    }
}