public class Point {
    public int x;
    private int y;
    public Point(int xCoordinate, int yCoordinate){
        this.x=xCoordinate;
        this.y=yCoordinate;
    }
    public void display(){
        System.out.println("("+this.x+","+this.y+")");
    }
    public double distanceFromOrigin(){
        return Math.sqrt(this.x*this.x+this.y*this.y);
    }
    public double distanceFromCoordinates(int x1, int y1){
        return Math.sqrt((this.x-x1)*(this.x-x1)+(this.y-y1)*(this.y-y1));
    }
    public double distanceFromPoint(Point p){
        return Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
    }
}