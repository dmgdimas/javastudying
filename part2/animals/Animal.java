package animals;
public abstract class Animal { // нельзя будет создать экземпляр класса Animal
    int age = 0;
    int height = 0;
    public static int count;
    public Animal(){
        this(0,0);
    }
    public Animal(int age, int height){
        this.age = age;
        this.height = height;
        count++;
    }
    public abstract void sound();
}
