package animals;
public class Cat extends Animal{
    public Cat(){
        super();
    }
    public Cat(int age, int height){
        super(age, height);
    }
    @Override
    public void sound(){
        System.out.println("Mew");
    }
}
