public class Kare {
    private int kenar;
    
    public Kare(int k){   //Constructor
        this.kenar=k;
    }
    public Kare(){//default constructor
        this.kenar=1;
    }
    public int alan(){
        return this.kenar*this.kenar;
    }
    public int cevre(){
        return this.kenar*4;
    }
    public String toString(){
        return "kenar="+this.kenar+"  alan=" +this.alan() +"  çevre=" + this.cevre();
    }
}