public class Object {
    public static void main(String[] args) {
        Point p1 = new Point(2,4);
        Point p2 = new Point();
        p1.printPoint();
        p2.printPoint();
        Point p3 = p1.center(p2);
        p3.printPoint();
    }
}

class Point{
    int x;
    int y;
    Point(){
        this(0,0);
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    void printPoint(){
        System.out.println("("+x+","+y+")");
    }
    Point center(Point other){
        return new Point((x+other.x)/2,(y+other.y)/2);
    }
}