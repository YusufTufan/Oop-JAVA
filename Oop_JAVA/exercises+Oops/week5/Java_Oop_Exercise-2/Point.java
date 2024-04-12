public class Point {//class
    public int x;  //fields
    private int y;
    public Point(int xCoordinate, int yCoordinate){//constructor
        this.x=xCoordinate;
        this.y=yCoordinate;
    }
    public Point(){ //Default constructor
    }
    //x fieldsı getter ve setter
    int getX(){
        return this.x;
    }
    void setX(int x){
        this.x = x;
    }
    //y fieldsı getter ve setter
    int getY(){
        return this.y;
    }
    void setY(int y){
        this.y = y;
    }
    //Methods
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
    public String toString(){ //toString (Açıklma içerir.)
        return "Nokta: " + "(" + this.x+ "," +this.y+ ")" + " Merkeze uzaklık: " + this.distanceFromCoordinates(0, 0);
    }
}
