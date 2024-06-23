 import java.util.Scanner;
 public class conditional {
    public static void main(String[] args)
    {
        // if else statement..............

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();

        if(age>=18)
        {
            System.out.println("you can vote");
        }

        else if(age>24)

        {
            System.out.println("absulately");
        }
          
        else {
            System.out.println("you cannot vote");
        }



        // Switch statments.........

        System.out.println("enter the number");
        int a =sc.nextInt();
          
        switch (a)
        {
            case 1:
            System.out.println("namaste");
            break;

            case 2:
            System.out.println("hello");
            break;

            default:
            System.out.println("wrong number");
        }


        // Ternary operator...............................................
        int n = 5;
        int result = 0;

        result = n%2==0 ? 10 : 20;
        System.out.println(result);
        sc.close();

    }     
    
}
