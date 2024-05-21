import java.util.Scanner;

public class Strings {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // String name = "Vishal Bhardwaj";
        // String name = sc.next(); for only one word...
        // String name = sc.nextLine(); for full sentences ..
        
        // CONCATENATION (add two string)

        String firstname = "vishal";
        String secondname = "Voultuuu";
        String Fullname = firstname + " aka " + secondname;
        System.out.println(Fullname);

        // TO CALCULATE THE LENGTH OF THE STRING...............................length()

        System.out.println(Fullname.length());

        // to PRINT THE ALL CHARACTER OF STRINGS...............................charAt

        for(int i=0;i<Fullname.length();i++)
        {
            System.out.println(Fullname.charAt(i));
        }


        // COMPARING TWO STRING..............................................compareTo()
        // there are three case 
        // 1. s1>s2 = +ve 
        // 2. s1<s2 = -ve
        // 3. s1==s2  = 0

        if(firstname.compareTo(secondname) == 0)
        {
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("String are not equal");
        }

        // SUB STRINGS...................................................
        // name.substring(beginning index,ending index);

        String name = Fullname.substring(0,10);
        System.out.println(name);

        

        sc.close();
    }
}
