import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        boolean asallik = true;        

        if (sayi<=1){ //1 ve daha küçük mü kontrolü
            asallik = false;
        }else{
            for (int i =2; i<=Math.sqrt(sayi); i++){  //Eğer sayının karekökü bölünüyorsa i'ye sayı asal değildir.
                if (sayi %i ==0){
                    asallik= false;
                    break;
                }
            }
        }
        if(asallik){
            System.out.print(sayi+" asal sayıdır...");
        }else{
            System.out.print(sayi+" asal sayı değildir...");
        } //Asallık durumlarına göre yazdırma.
        scanner.close();  
    }
}