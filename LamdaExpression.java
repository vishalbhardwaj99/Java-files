
@FunctionalInterface
interface A
{
    int show(int i,int j);
}

public class LamdaExpression {
    public static void main(String[] args)
    {
       A obj = (i,j) -> i+j;   // LAMDA EXPRESSION..............
       int result = obj.show(5,4);
       System.out.println(result);
    }
}
