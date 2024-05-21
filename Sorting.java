import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // BUBBLE SORT ...........................................

        System.out.println("Enter the number of elementds");
        int n = sc.nextInt();
        System.out.println("Enter the elements in array ");
        int[] a = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i<a.length-1; i++)
        {
            for(int j=0; j<a.length-1-i; j++)
            {
                int temp;
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }

        // SELECTION SORT...........................................................

         System.out.println("\nEnter the size of array");
         int size = sc.nextInt();
         int[] arr = new int[size];
         System.out.println("Enter the elements");
         for(int i=0; i<size; i++)
         {
            arr[i] = sc.nextInt();
         }

         for(int i=0; i<arr.length-1; i++)
         {
            int smallest=i;
            for(int j=1+i; j<arr.length; j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest = j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
         }

         for(int i=0; i<arr.length; i++)
         {
            System.out.print(arr[i] + " ");
         }

         // INSERTION SORT.....................................................................

         sc.close();
    }
}
