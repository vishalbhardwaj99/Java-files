import java.util.Scanner;
public class advance_pattern {
    public static void main(Strings[] args)
     {
        // BUTTERFLY PATTERN...................................................................
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            for(int j=1;j<=2*(a-i);j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=a;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            for(int j=1;j<=2*(a-i);j++)
            {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // SOLID RHOMBUS................................................................
         
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" " + " ");
            }

            for(int j=1;j<=n;j++)
            {
                System.out.print("*" + " ");
            }

            System.out.println();
        }


        // NUMBER PYRAMID.......................................................................

        System.out.println("enter the number of rows");
        int b=sc.nextInt();

        for(int i=1; i<=b; i++)
        {
            for (int j=1;j<=b-i;j++)
            {
                System.out.print(" ");
            }

            for (int j=1;j<=i;j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // PALINDROME PATTERN..........................................................................

        System.out.println("enter the number of rows");
        int c=sc.nextInt();

        for(int i=1;i<=c;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }

            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }


        // DIAMOND PATTERN ................................................................................

        System.out.println("enter the number of rows");
        int d=sc.nextInt();
        
        for(int i=1;i<=d;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=d;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
        sc.close();

    }
}
