enum Laptop{
    MacOs(2000), XPS(2200), Surface;

    private int price;

    

    private Laptop() {
        price = 500;
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("in Laptop" + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

public class Enum {
    public static void main(String[] args)
    {
    //    Laptop lap = Laptop.MacOs;
    //    System.out.println(lap + ":" + lap.getPrice());
        for( Laptop lap : Laptop.values())
        {
            System.out.println(lap + ":" +lap.getPrice());
        }
    }
}
