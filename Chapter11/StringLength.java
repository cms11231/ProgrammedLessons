public class StringLength
{
    public static void main ( String[] args )
    {
        String str;
        int    len;
        
        str = new String( "     " );

        len = str.length();

        System.out.println("The length is: " + len );
    }
}