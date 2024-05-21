import java.util.Scanner;
public class functions {

    public static int Factorial(int a)
    {
        if(a==0)
        return 1;
        if(a==1)
        return 1;

        int Fact1=Factorial(a-1);
        int Fact=a*Fact1;
        return Fact;
    }

    public static void myname(String name)
    {
        System.out.println(name);
        return;
    }
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
         myname(name);
        System.out.println("enter the number");
         int a = sc.nextInt();
         System.out.println("factorial is " + Factorial(a));


         sc.close();

    }


}
