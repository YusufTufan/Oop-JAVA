import java.util.ArrayList;
public class PolyLine {
    private ArrayList <Point> points;

    public PolyLine(){
        this.points = new ArrayList<>();
    }

    public PolyLine(Line line){
        this.points = new ArrayList<>();
        addLine(line);
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    public void addPoint(Point point){
        points.add(point);
    }

    public void addLine(Line line) {
        points.add(line.getIlknokta());
        points.add(line.getSonnokta());

        boolean ilknoktavarmi =false;
        boolean sonnoktavarmi =false;

        for(Point nokta:points){
            if(nokta.equals(line.getIlknokta())){
                ilknoktavarmi = true;
            }
            if(nokta.equals(line.getSonnokta())){
                sonnoktavarmi = true;
            }
        }
        if(!ilknoktavarmi){
            points.add(line.getIlknokta());
        }
        if(!sonnoktavarmi){
            points.add(line.getSonnokta());
        }
    }

    public PolyLine addPolyLine(PolyLine line) {
        for (Point point : line.getPoints()) {
            points.add(point);
        }
        return this;
    }

    public String toString(){
        StringBuilder sondurum = new StringBuilder("[");
        for(Point point:points){
            sondurum.append(point.toString()).append(",");
        }
        if (!points.isEmpty()) {
            sondurum.setLength(sondurum.length() - 1);
        }
        sondurum.append("]");
        return sondurum.toString();
    }

    public double length(){
        double tum_uzunluk = 0;
        for (int i = 0; i < points.size()-1; i++) {
            Point ilkPoint = points.get(i);
            Point siradakiPoint = points.get(i+1);
            tum_uzunluk += ilkPoint.distanceFromPoint(siradakiPoint);   
        }
        return tum_uzunluk;
    }

    public PolyLine reverse(){ 
        ArrayList<Point> reversednoktalar = new ArrayList<>();
        for (int i = points.size()-1; i >=0; i--) {
            reversednoktalar.add(points.get(i));          
        }
        PolyLine reversedPolyLine = new PolyLine();
        reversedPolyLine.setPoints(reversednoktalar);
        return reversedPolyLine;
    }
}