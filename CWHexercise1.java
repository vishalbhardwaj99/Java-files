 import java.util.Scanner;
 public class CWHexercise1 {
    public static void main(Strings[] args)
    {
        Scanner sc = new Scanner(System.in);

         // write a program to sum fo three numbetrs

         System.out.println("enter three numbers");
         int n= sc.nextInt();
         int p= sc.nextInt();
         int q= sc.nextInt();

         int sum = n+p+q;
         System.out.println("sum :-"+sum);
        

        // question number 2...................

        System.out.println("enter your name");
        String a = sc.nextLine();
        System.out.println("Hello " +a+ " HAVE A GREAT DAY");
        
        sc.close();

    }
}
