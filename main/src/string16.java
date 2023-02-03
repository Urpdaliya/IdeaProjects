public class string16
{
    public static void main(String argvs[])
    {
        String str = "Welcome To Java";
        int size = str.length();

        System.out.println("Reverse of the string: " + "'" + str + "'" + " is");

        for(int i = 0; i < size; i++)
        {

            System.out.print(str.charAt(str.length() - i - 1));
        }

    }
}
