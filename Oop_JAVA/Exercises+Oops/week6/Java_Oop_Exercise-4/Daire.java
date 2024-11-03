public class Daire {//class
    int x;
    int y;
    int r;
    public Daire(int r, int x, int yCoordinate){//Constructor ve class adlandırması aynı olmalıdır.
        this.r=r;
        this.x=x;
        this.y=yCoordinate;
    }
    public double alan(){//Method1
        return Math.PI*this.r*this.r;
    }
    public double cevre(){//Method2
        return 2*Math.PI*this.r;
    }
    public double merkezeUzaklik(){//Method3
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }
    public double digerDaireyeUzaklik(Daire d){//Method4
        return Math.sqrt((this.x-d.x)*(this.x-d.x)+(this.y-d.y)*(this.y-d.y));
    }
    public String toString(){//Açıklama
        return "yarıçap="+ this.r +" alan="+ this.alan() + "çevre="+ this.cevre();
    }
}
