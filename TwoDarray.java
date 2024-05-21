import java.util.Scanner;
public class TwoDarray {
    public static void main(Strings[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows :-");
        int rows=sc.nextInt();
        System.out.println("Enter the columns :-");
        int cols=sc.nextInt();
        int[][]arr = new int[rows][cols];

        System.out.println("Enter the elements :-");

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the number to search:-");
        int num = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
            {
               if(arr[i][j] == num)
               {
                //   System.out.print("the indices of the element is:- " +i );
                //   System.out.print(","+j);
                System.out.println("the indices is :- (" + i + "," + j + ")");
               }
            }
        }
        sc.close();
    }
}
