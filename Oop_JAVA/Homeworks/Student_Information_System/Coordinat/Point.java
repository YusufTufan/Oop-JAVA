public class Point {
    private int x;
    private int y;

    public Point(int x_coordinate,int y_coordinate){
        this.x = x_coordinate;
        this.y = y_coordinate;
    }

    int getX(){
        return x;
    }

    void setX(int x_coordinate){
        this.x = x_coordinate;
    }

    int getY(){
        return y;
    }

    void setY(int y_coordinate){
        this.y =y_coordinate;
    }

    public double distanceFromPoint(Point p){
        return Math.sqrt((this.getX()-p.getX())*(this.getX()-p.getX())+(this.getY()-p.getY())*(this.getY()-p.getY()));
    }

    public String toString(){
        return "(x=" + this.x + "," + " y=" + this.y + ")";
    }
}