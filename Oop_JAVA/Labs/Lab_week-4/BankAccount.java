public class BankAccount {
    private String HesapNo;
    private float Bakiye;

    public BankAccount(String HesapNo){
        setHesapNo(HesapNo);
        setBakiye(0);
    }

    String getHesapNo(){
        return this.HesapNo;
    }
    void setHesapNo(String HesapNo){
        this.HesapNo = HesapNo;
    }

    float getBakiye(){
        return this.Bakiye;
    }
    void setBakiye(float Bakiye){
        this.Bakiye = Bakiye;
    }

    public void ParaYatir(float miktar){
        if(miktar<0){
            System.out.println("Geçersiz miktar. Lütfen 0' dan yüksek bir değer giriniz...");
        }
        else{
            this.Bakiye += miktar;
            System.out.println("Paranız yatırıldı.");
        }
    }

    public void ParaCek(float miktar){
        if(miktar<0){
            System.out.println("Geçersiz miktar. Lütfen 0' dan yüksek bir değer giriniz...");
        }else if(miktar<=this.Bakiye){
            this.Bakiye -=miktar;
            System.out.println("Paranız çekilmiştir...");
        }else{
            System.out.println("Hesabınızda bu kadar para yok...");
        }
    }

    public void Havale(BankAccount other, float miktar){
        if(miktar<0){
            System.out.println("Geçersiz miktar. Lütfen 0' dan yüksek bir değer giriniz...");
        }else if(miktar<=this.Bakiye){
            this.Bakiye -=miktar;
            other.ParaYatir(miktar);
            System.out.println("İşleminiz gerçekleşti...");
        }else{
            System.out.println("Bu havale için yeterli paran yok...");
        }
    }
    
    public void HesaplarimArasindaHavale(BankAccount first, BankAccount second, float miktar){
        if(miktar<0){
            System.out.println("Geçersiz miktar. Lütfen 0' dan yüksek bir değer giriniz...");
        }else if(miktar<=first.Bakiye){
            first.Bakiye -=miktar;
            second.ParaYatir(miktar);
            System.out.println("İşleminiz gerçekleşti...");
        }else{
            System.out.println("Bu havale için yeterli paran yok...");
        }
    }
}