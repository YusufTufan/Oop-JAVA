public class Line {
    private Point ilknokta;
    private Point sonnokta;

    public Line(Point p1,Point p2){
        this.ilknokta =p1;
        this.sonnokta =p2;
    }

    Point getIlknokta(){
        return this.ilknokta;
    }

    void setIlknokta(Point p1){
        this.ilknokta = p1;
    }

    Point getSonnokta(){
        return this.sonnokta;
    }

    void setSonnokta(Point p2){
        this.sonnokta = p2;
    }

    public double length(){
        return ilknokta.distanceFromPoint(sonnokta);
    }

    public String toString(){
        return ilknokta.toString() + " , " + sonnokta.toString();
    }
}