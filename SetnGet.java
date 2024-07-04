public class SetnGet {
    public static void main(String[] args)
    {
        Human obj = new Human();
        Human obj1 = new Human(16,"Arpitt");
        System.out.println(obj.getName() + ":" + obj.getAge());
        System.out.println(obj1.getName() + ":" + obj1.getAge());
        
        // obj.setAge(15);
        // obj.setName("Arpit");
        // System.out.println(obj.getName() + ":" + obj.getAge());
    }
}

class Human{
    private int age;
    private String name;

    public Human(int age, String name) { // PARAMETERIZED CONSTRUCTOR.......................
        this.age = age;
        this.name = name;
    }

    public Human() {      // DEFAULT CONSTRUCTOR.......................
        age = 15;
        name = "Arpit";

    }


    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
