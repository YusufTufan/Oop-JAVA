public class SuperDaire {
    int r;
    Point merkez;
    public SuperDaire(int r, int x, int yCoordinate){
        this.r=r;
        merkez=new Point(x,yCoordinate);
    }
    public double alan() {
        return Math.PI*this.r*this.r;
    }
    public double cevre(){
        return 2*Math.PI*this.r;
    }
    public double merkezeUzaklik(){
        return merkez.distanceFromOrigin();
    }
    public double digerDaireyeUzaklik(SuperDaire digerDaire){
        return merkez.distanceFromPoint(digerDaire.merkez);
    }
    public String toString(){
        return "alan= " + this.alan() + " çevre= " + this.cevre() + " MerkezeUzaklık " + this.merkezeUzaklik();
    }
}
