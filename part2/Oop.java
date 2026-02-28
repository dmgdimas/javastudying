import animals.*;

public class Oop {
    public static void main(String[] args) {
        // 1. Принципы ООП
        Animal myCat = new Cat(2,55);
        myCat.sound();
        Animal myWolf = new Wolf(2,23);
        myWolf.sound();
        System.out.println(Animal.count);
        // нельзя создать new Animal(), потому что это абстрактный класс

        // 2. Enums
        for (Enums el:Enums.values()){
            System.out.println(el.name() + " " + el.ordinal());
        }
    }
}
