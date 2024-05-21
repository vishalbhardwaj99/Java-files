import java.util.Scanner;
public class sum {
    public static void main(Strings[] args)
	{
        //input (string)....................
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //output....................................
        System.out.println(name);

        //input (int)........................
		System.out.println("enter the number 1");
        int a = sc.nextInt();
        System.out.println("enter the number 2");
        int b =sc.nextInt();
        
        //output.................................
        int sum = a+b;
        System.out.print("sum is  ");
        System.out.println(sum);
        System.out.println((a*b)/(a-b));

        //input (Float)....................................
        System.out.println("enter the decimal number 1");
	    float x = sc.nextFloat();    
        System.out.println("enter the decimal number 2");
        float y = sc.nextFloat();

        //output.........................................
        float jor = x+y;
        System.out.print("sum is  ");
        System.out.println(jor);

        //input(char)..........................................
        System.out.println("enter alphabet 1");
        char p = sc.next().charAt(0);
        System.out.println("enter alphabet 2");
        char q = sc.next().charAt(0);

        int plus = p+q;

    
        //output................................................
        System.out.println("the alphabet 1:" +p);
        System.out.println("the alphabet 2:" +q);
        System.out.println("the sum is : " + plus);

        //same for mutiply and division as well as modulus function....
        

        sc.close();

    }   
}
