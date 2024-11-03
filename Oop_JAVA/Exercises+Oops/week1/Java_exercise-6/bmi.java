import java.util.Scanner; //Scanner tanımlamak.
public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen kilonuzu giriniz.");
        double kilo = scanner.nextDouble();            //boy bilgisini almak.
        System.out.print("Lutfen boyunuzu giriniz.");
        double boy = scanner.nextDouble();             //kilo bilgisini almak.

        double Bmi = kilo/((boy/100)*(boy/100));       //vücut kitle endeksini hesaplamak.

        String Bmi_aralik;                            //Vücut kitle endeksi aralığı için değişken tanımlamak.
        if(Bmi<18.5){                                 //if bloğunun tamamında ise aralık tespiti yapılıyor.
            Bmi_aralik ="Zayif";
        }else if(Bmi >=18.5 && Bmi<25){
            Bmi_aralik = "Normal";
        }else if(Bmi>=25&& Bmi<30){
            Bmi_aralik = "Fazla Kilolu";
        }else{
            Bmi_aralik ="Obez";
        }
        System.out.println("Vucut kitle Endeksi sonucunuz:"+Bmi);     //vücut kitle endeksini yazdır.
        System.out.println("BMI Kategoriniz:"+Bmi_aralik);            //Vücut kitle endeksi aralığı yazdır.
        scanner.close();
    }
}