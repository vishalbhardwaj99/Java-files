import java.util.Scanner;
public class leetcode{
    public static int firstUniqChar(String s) {
        int count = 1;
        for(int i=0; i<s.length()-1;i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i) != s.charAt(j))
                {
                    count++;
                    System.out.print(count);
                    if(count == s.length())
                    {
                        System.out.println(s.charAt(i));
                        return s.charAt(i);
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String sb = sc.nextLine();

        firstUniqChar(sb);
        sc.close();
    }
}
