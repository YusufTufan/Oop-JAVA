public class Divisible {
    public static void main(String[] args) {
    int sayi1 = 9;
    int sayi2 = 18;                //2 tane değişken tanımlıyoruz.

    if (divisible(sayi1, sayi2)){    //Dönüşe göre sayının durumunu yazdırıyoruz.
        System.out.println("Bölünebilir sayıdır.");
    }else{
        System.out.println("Bölünemez sayıdır.");
    }
    }
    public static Boolean divisible (int number1, int number2){  //değişkenlerimizi buraya gönderip boolean bir dönğt alıyoruz.
        return number1 % number2 == 0;
    }
}