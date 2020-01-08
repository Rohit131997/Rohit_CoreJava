public class StringBufferExample
{
    public static void main(String[] args)
    {
        StringBuffer s = new StringBuffer("Rohit");
        s.append("Varma");
        System.out.println(s); // returns RohitVarma
        s.append(10);
        System.out.println(s); // returns RohitVarma10
    }

}
