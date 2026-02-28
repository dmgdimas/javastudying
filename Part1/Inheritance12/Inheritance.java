public class Inheritance {
    public static void main(String[] args) {
        Figure threeFig = new Figure(3,10);
        Subfigure three = new Subfigure(3,10);
        Subfigure def = new Subfigure();
        System.out.println(three.foo());
        System.out.println(def.foo());
        System.out.println(threeFig.foo());
    }
}
class Figure {
    private final int points;
    private int length;
    Figure(){
        this(1,10);
    }
    Figure(int points,int length){
        this.points=points;
        this.length=length;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return this.length;
    }
    public int foo(){
        return points*length;
    }
}
class Subfigure extends Figure{
    Subfigure(){
        super();
    }
    Subfigure(int points,int length){
        super(points,length);
    }
    public int foo(){
        this.setLength(this.getLength()/2);
        return super.foo();
    }
}




