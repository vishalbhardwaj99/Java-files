import java.util.Scanner;

public class patterns
{
    public static void main(String[] args)
    {
        // SOLID PATTERN........................................
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int a = sc.nextInt();
        System.out.println("enter the number of column");
        int b = sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=b;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        
        // HOLLOW RECTANGLE..........................................
        System.out.println("enter the number of rows");
        int c = sc.nextInt();
        System.out.println("enter the number of column");
        int d = sc.nextInt();

        for(int x=1; x<=c;x++)
        {
            for(int y=1; y<=d;y++)
            {
                if(x==1  || y==1 || x==c || y==d)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        
        // HALF PYRAMID.....................................................
        System.out.println("enter the number of rows");
        int e = sc.nextInt();

        for(int u=1;u<=e;u++)
        {
            for(int v=1;v<=u;v++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //INVERTED HALF PYRAMID..................................................

        System.out.println("enter the number of rows");
        int f= sc.nextInt();

        for(int u=f;u>=1;u--)
        {
            for(int v=1;v<=u;v++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
       


        // INVERTED HALF PYRAMID ( ROTATED BY 180 degree).............................................................

        System.out.println("enter the number of rows");
        int g = sc.nextInt();

        for(int u=1;u<=e;u++)
        {
            for(int v=1;v<=g-u;v++)
            {
                System.out.print(" ");
            }
            
            for(int v=1;v<=u;v++)
            {
                System.out.print("*");
            }

            
            System.out.println();
        }

        // HALF PYRAMID WITH NUMBERS......................................................................

        System.out.println("enter the number of rows");
        int h = sc.nextInt();

        for(int u=1;u<=h;u++)
        {
            for(int v=1;v<=u;v++)
            {
                System.out.print(v+ " ");
            }
            System.out.println();
        }

        // INVERTED HALF PYRAMID WITH NUMBERS...................................................................

        System.out.println("enter the number of rows");
        int i = sc.nextInt();

        for(int u=i;u>=1;u--)
        {
            for(int v=1;v<=u;v++)
            {
                System.out.print(v+ " ");
            }
            System.out.println();
        }

        // FLOYD'S TRIANGLE............................................................................

        System.out.println("enter the number of rows");
        int j = sc.nextInt();
        int sum =1;

        for(int u=1;u<=j;u++)
        {
            for(int v=0;v<u;v++)
            {
                System.out.print( sum+ " ");
                sum++;
            }
            System.out.println();
        }

        // 0-1 TRIANGLE.............................................................................

        System.out.println("enter the number of rows");
        int k = sc.nextInt();

        for(int u=1;u<=k;u++)
        {
            for(int v=1;v<=u;v++)
            {
               int plus = v+u;
                if( plus%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        sc.close();

    } 
}