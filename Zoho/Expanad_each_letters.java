package Zoho;

public class Expanad_each_letters {
    public static void main(String[] args) {
        String input ="a2b5";

        System.out.println("Answer is "+Expand_function(input));
    }
    public static String Expand_function(String str )
    {
        StringBuilder result=new StringBuilder();

        int i=0;

        while(i<str.length())
        {
            char ch=str.charAt(i);
            i++;
            StringBuilder multiply=new StringBuilder();

            while(i<str.length() && Character.isDigit(str.charAt(i)))
            {
                multiply.append(str.charAt(i));
                 i++;
            }
            int count=Integer.parseInt(multiply.toString());

            for (int j=0;j<count;j++)
            {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
