import java.util.Scanner;

public class Stringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("voult");
        System.out.println(sb);

        // char at index 0.................
        System.out.println(sb.charAt(0));

        // set char at 0...................

        sb.setCharAt(0,'s');
        System.out.println(sb);

        // insert the char at ..............

        sb.insert(0,'v');
        System.out.println(sb);   
        
        // deleting char.................

        sb.delete(2,3);
        System.out.println(sb);

        // apend..............................

        sb.append("aka");
        sb.append("vishal");
        System.out.println(sb);

        // length.......................
        System.out.println(sb.length());

        // question.................................revers the string{}

        for(int i=sb.length()-1;i>=0;i--)
        {
            System.out.print(sb.charAt(i));
        }
        sc.close();
    }
}
