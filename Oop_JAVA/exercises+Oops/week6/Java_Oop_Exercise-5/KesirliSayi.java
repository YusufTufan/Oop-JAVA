public class KesirliSayi {
    private int pay;
    private int payda;

    public int getPayda() {//Paydayı almak.
        return payda;
    }
    public void setPayda(int payda) {//Payda 0 olma durumunu değerlendirme gerekirse 1 olarak atama yapmak.
        if(payda==0){
            System.out.println("payda 0 olamaz otomatik olarak 1 atandı");
            this.payda=1;
        }else
            this.payda = payda;
    }
    public KesirliSayi(int pay, int payda){//Constructor
        this.pay=pay;
        this.setPayda(payda);
        sadelestir();
    }
    private void sadelestir(){//varsa gerekli sadeleştirmeyi yapmak.
        int ortakBolen=obeb(this.pay, this.payda);
        this.pay=this.pay/ortakBolen;
        this.payda=this.payda/ortakBolen;
    }
    public int obeb(int a, int b){ //pay ve paydanın obebinni bulmak.
        if (b==0) return a;
        return obeb(b, a%b);
    }
    public KesirliSayi topla(KesirliSayi k){
        int sonucPayda=this.payda*k.payda;
        int sonucPay=(this.pay*k.payda+this.payda* k.pay);
        return new KesirliSayi(sonucPay, sonucPayda);
    }
    public KesirliSayi carp(KesirliSayi k){
        int sonucPayda=this.payda*k.payda;
        int sonucPay=this.pay*k.pay;
        return new KesirliSayi(sonucPay, sonucPayda);
    }
    public String toString(){
        return this.pay+"/"+this.payda;
    }
}
