import java.util.Scanner;
public class Recursion {

    public static void ReverseString(String s, int n)
    {
        if(n==0){
        System.out.print(s.charAt(n));
        return;
        }
        
            System.out.print(s.charAt(n));
            ReverseString(s, n-1);
    }
    public static void towerofhanoi(int n, String src, String helper, String destination)
    {
        if(n==1){
        System.out.println("transfer disk " + n + " from " + src + " to " + destination);
        return;
        }
        towerofhanoi(n-1, src, destination, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + destination);
        towerofhanoi(n-1, helper, src, destination);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TOWER OF HANOI........................................................
        System.out.println("Enter number of disk-");
        //int n = sc.nextInt();
        //towerofhanoi(n, "S", "H", "D");
        
        // PRINT A STRING IN REVERSE.......................................

        System.out.println("Enter the string - ");
        String sb = sc.nextLine();
        ReverseString(sb, sb.length()-1);
        sc.close();
    }
}
