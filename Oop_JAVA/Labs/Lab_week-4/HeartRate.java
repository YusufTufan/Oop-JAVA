public class HeartRate {//class
    private String ad;//fields
    private String soyAd;
    private int dogumYili;

    public HeartRate(String ad, String soyAd, int dogumYili){//constructor
        setAd(ad);
        setSoyAd(soyAd);
        setDogumYili(dogumYili);
    }
    //getter-setter
    String getAd(){
        return ad;
    }
    void setAd(String ad){
        this.ad = ad;
    }
    String getSoyAd(){
        return soyAd;
    }
    void setSoyAd(String soyAd){
        this.soyAd = soyAd;
    }
    int getADogumYili(){
        return dogumYili;
    }
    void setDogumYili(int dogumYili){
        this.dogumYili = dogumYili;
    }
    //methods
    public int getAge(){
        return 2024-this.dogumYili;
    }

    public int MaxHeartRate(){
        return 220-getAge();
    }

    public void RequriedHeartrate(){
        double minHeartRate  =MaxHeartRate()*0.5;
        double maxHeartRate  =MaxHeartRate()*0.85;
        System.out.println("Kalp atşınız, "+ minHeartRate +"-"+maxHeartRate +" aralığında olmalıdır.");
    }
}