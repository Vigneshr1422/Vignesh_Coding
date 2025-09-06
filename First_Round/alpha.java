package First_Round;

public class alpha {
    public static void main(String[] args) {

        char a='A';

        for(int i=5;i>=1;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print((char)(a+j)+" ");
            }
            System.out.println();
        }
    }
}
