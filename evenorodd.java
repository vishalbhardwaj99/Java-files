import java.util.Scanner;

public class evenorodd {
    public static void main(Strings[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();

        if(number%2==0)
        {
            System.out.println("even");
        }

        else{
            System.out.println("odd");
        }
        sc.close();

    }
}
