public class GaripSayi {
    public static void main(String[] args) {
        int number = 371;                     //SAYI GELDİ...
        if(garipMi(number)){ //Garip mi methoduna gitti argüman olarak number aldı...
            System.out.println(number + " garip sayıdır.");
        }else{
            System.out.println(number + " garip sayı değildir");
        }
    }
    public static boolean garipMi(int number){
        if(number<100 || number>999){    //Basamak kontrolü yapıldı.
            System.out.println("3 basamaklı sayı girmediniz...");
            return false;     //yanlışsa doğrudan olmaz dedi.
        }
        int number_1 = sayi%10;    //Basamaklara erişti.
        int number_2 = (sayi/10)%10;
        int number_3 = sayi/100;
        int sum = (number_1*number_1*number_1)+(number_2*number_2*number_2)+(number_3*number_3*number_3);  //basamakların küpünü aldı ve toplam elde etti.
        return sum == number;    // toplamı number ile karşılaştırdı. Sonucu döndürdü...
    } 
}