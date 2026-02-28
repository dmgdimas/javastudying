package animals;
public class Wolf extends Animal{
    public Wolf(){
        super();
    }
    public Wolf(int age, int height){
        super(age,height);
    }
    @Override
    public void sound(){
        System.out.println("waw");
    }

    public void howl(){
        System.out.println("woooo");
    }
}
