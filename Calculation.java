public class Calculation {
    public static void main(String[] args)
    {
        AdvanceCalc obj = new AdvanceCalc();
        int r1 = obj.Add(4,6);
        int r2 = obj.Sub(6,5);
        int r3 = obj.Multi(15,3);
        int r4 = obj.Div(15,4);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}
