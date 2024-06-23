import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // int[]marks = new int[100];
        // int[]marks2 = {97,98,99};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:- ");
        int n = sc.nextInt();
        int a[] = new int[n];
        
        System.out.println("Enter the elements");

        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the element to search");
        int num = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            if(a[i]==num)
            {
                System.out.println("the searched element at index :- " +i);

            }

        }
        sc.close();
    }

}
