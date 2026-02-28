public class Functions {
    private String name;
    public static void foo1(){
        // публичная - можно обращаться из любой части кода
        // статичная - обращение через Functions.foo1(), а не через объект класса
        // void - не требует return

    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("John");
        System.out.println(s1.getName());

    }
}

class Student{
    private String name;
    public String getName(){
        // обращение через объект класса, а не через сам класс
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}