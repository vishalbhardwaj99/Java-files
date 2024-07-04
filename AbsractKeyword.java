abstract class Car
{

    public abstract void drive();
    public abstract void fly();

    public void playmusic()
    {
        System.out.println("play Music");
    }
}

abstract class WagonR extends Car{

    public void drive()
    {
        System.out.println("Drive..");
    }
}

class UpdateWagon extends WagonR
{
    public void fly() {
        System.out.println("flying...");
    }

}

public class AbsractKeyword {
    public static void main(String[] args)
    {
        Car obj = new UpdateWagon();
        obj.drive();
        obj.playmusic();
        obj.fly();
    }
}
